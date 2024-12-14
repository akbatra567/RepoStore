package com.buildingforfun.Repo.Store.user;

import org.springframework.stereotype.Component;

@Component
public class UsersService {
    public String createUser(UserRequestDto userRequestDto) {
        System.out.println(userRequestDto.toString());
        return "success";
    }
}
