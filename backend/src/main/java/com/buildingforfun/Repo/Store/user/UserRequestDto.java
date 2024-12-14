package com.buildingforfun.Repo.Store.user;

public class UserRequestDto {

    String userUuid;
    String userName;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return "UserRequestDto{" +
                "userUuid='" + userUuid + '\'' +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
