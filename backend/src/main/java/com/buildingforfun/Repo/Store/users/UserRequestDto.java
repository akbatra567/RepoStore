package com.buildingforfun.Repo.Store.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {

    String userName;
    String firstName;
    String lastName;
    String email;
    String password;

    @Override
    public String toString() {
        return "UserRequestDto{" +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
