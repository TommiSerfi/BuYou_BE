package com.buyou.BuYou.service;

import com.buyou.BuYou.entity.User;
import com.buyou.BuYou.repository.UserRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class MassiveUploadService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MockService mockService;

    public String uploadEntities() throws IOException{
        List<User> user = mockService.getMock(new TypeReference<List<User>>() {
        }, "massiveUpload/entities/user.json");
        userRepository.saveAll(user);
        return "Users saved";
    }
}
