package com.pablobarguzino.ru.controller;

import com.pablobarguzino.ru.model.User;
import com.pablobarguzino.ru.repository.UserRepositoryIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class UserController {
    UserRepositoryIF userRepository;

    @PostConstruct
    public void createUsers() {
        userRepository.save(new User(1L, "login1"));
        userRepository.save(new User(2L, "login2"));
        userRepository.save(new User(3L, "login3"));
    }

    @Autowired
    public UserController(UserRepositoryIF userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users/all")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }
}
