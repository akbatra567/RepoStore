package com.buildingforfun.Repo.Store.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/create")
    Users createUser(@RequestBody UserRequestDto userRequestDto){
        return usersService.createUser(userRequestDto);
    }
}
