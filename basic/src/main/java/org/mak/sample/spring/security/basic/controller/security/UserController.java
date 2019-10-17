package org.mak.sample.spring.security.basic.controller.security;

import org.mak.sample.spring.security.basic.domain.security.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/get")
    @PreAuthorize("hasRole('RoleUser')")
    public User getUser() {
        return User.builder().id(1L)
                .username("Mehdi")
                .password("pass").build();
    }

    @GetMapping("/list")
    @PreAuthorize("hasRole('RoleAdmin')")
    public List<User> listUsers() {
        List<User> users = new ArrayList<User>();
        users.add(User.builder().id(1L).username("Mehdi").password("pass").build());
        users.add(User.builder().id(1L).username("ali").password("pass").build());
        return users;
    }

}
