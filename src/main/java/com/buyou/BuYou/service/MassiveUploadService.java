package com.buyou.BuYou.service;

import com.buyou.BuYou.entity.Product;
import com.buyou.BuYou.entity.User;
import com.buyou.BuYou.repository.ProductRepository;
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
    private ProductRepository productRepository;

    @Autowired
    private MockService mockService;

    public void uploadEntities() throws IOException{
/*        List<User> user = mockService.getMock(new TypeReference<List<User>>() {
        }, "massiveUpload/entities/user.json");
        userRepository.saveAll(user);*/

        List<Product> product = mockService.getMock(new TypeReference<List<Product>>() {
        }, "massiveUpload/entities/product.json");
        productRepository.saveAll(product);
    }
}
