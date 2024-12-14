package com.buildingforfun.Repo.Store.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/create")
    String createUser(@RequestBody() UserRequestDto userRequestDto){
        return usersService.createUser(userRequestDto);
    }
}
