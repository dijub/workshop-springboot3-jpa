package com.dijub.springproject.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dijub.springproject.entities.Order;
import com.dijub.springproject.entities.User;
import com.dijub.springproject.entities.enums.OrderStatus;
import com.dijub.springproject.repositories.OrderRepository;
import com.dijub.springproject.repositories.UserRepository;

/**
 * TestConfig
 */
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98798888", "123456");
        User u2 = new User(null, "Alex Green", "alec@gmail.com", "98791234", "654321");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:43:07Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o3 = new Order(null, Instant.parse("2019-08-22T15:23:07Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }

}
