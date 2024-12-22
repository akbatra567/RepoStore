package com.buildingforfun.Repo.Store.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public Users createUser(UserRequestDto userRequestDto) {
        Users user = new Users().builder()
                .userName(userRequestDto.userName)
                .firstName(userRequestDto.firstName)
                .lastName(userRequestDto.lastName)
                .email(userRequestDto.email)
                .password(userRequestDto.password)
                .is_active(true)
                .is_verified(false)
                .created_at(new Date(System.currentTimeMillis()))
                .updated_at(new Date(System.currentTimeMillis())).build();
        return usersRepository.save(user);
    }
}
