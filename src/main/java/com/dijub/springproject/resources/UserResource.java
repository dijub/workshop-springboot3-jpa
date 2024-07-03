package com.dijub.springproject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dijub.springproject.entities.User;

/**
 * UserResource
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1l, "maria", "maria@gmail.com", "4399995954", "123456@");
        return ResponseEntity.ok().body(u);

    }
}
