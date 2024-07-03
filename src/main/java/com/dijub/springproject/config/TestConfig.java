package com.dijub.springproject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dijub.springproject.entities.User;
import com.dijub.springproject.repositories.UserRepository;

/**
 * TestConfig
 */
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98798888", "123456");
        User u2 = new User(null, "Alex Green", "alec@gmail.com", "98791234", "654321");

        userRepository.saveAll(Arrays.asList(u1, u2));

    }

}
