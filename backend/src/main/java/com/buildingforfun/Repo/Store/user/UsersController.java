package com.buildingforfun.Repo.Store.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/create")
    String createUser(){
        return usersService.createUser();
    }
}
