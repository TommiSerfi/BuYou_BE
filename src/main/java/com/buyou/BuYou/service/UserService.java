package com.buyou.BuYou.service;

import com.buyou.BuYou.entity.User;
import com.buyou.BuYou.entity.UserLogin;
import com.buyou.BuYou.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class UserService {

    //private List<User> userList = new ArrayList<>();
    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());

    @Autowired
    private UserRepository userRepository;

    public String addNewUser(User user){
        User newUser = user;
        Boolean check = true;
        if(null != newUser.getFirstName() && null != newUser.getLastName() && null != newUser.getUsername()
                && null != newUser.getPassword() && null != newUser.getRole()) {
            // CONTROLLO SU USERNAME UNIVOCO
/*            for(int i = 0; i < userList.size(); i++){
                if (newUser.getUsername().equals(userList.get(i).getUsername())){
                    LOGGER.info("USERNAME GIA' ESISTENTE");
                    check = false;
                }
            }*/
            for (User uCheck : userRepository.findAll()){
                if (uCheck.getUsername().equals(newUser.getUsername())){
                    LOGGER.info("USERNAME GIA' ESISTENTE");
                    check = false;
                }
            }
            if (check){
                userRepository.save(newUser);
                //userList.add(newUser);
                return "USER ADDED";
            }else{
                return "USER COULD NOT BE ADDED";
            }
        }else{
            LOGGER.info("PER INSERIRE UN NUOVO UTENTE E' NECESSARIO INSERIRE TUTTI I CAMPI FONDAMENTALI!");
            return "USER COULD NOT BE ADDED";
        }
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public Boolean userLogin(String username, String password) {
        Boolean result = false;
        Optional<User> opt = userRepository.findByUsernameAndPassword(username, password);

        if (opt.isPresent()) {
            return result = true;
        } else {
            return result;
        }
    }

    public Iterable<User> getRole(Role role){
        return userRepository.findByRole(role);
    }
}