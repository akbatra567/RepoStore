package com.buildingforfun.Repo.Store.user;

import jakarta.persistence.*;
import lombok.*;

@Entity()
@Builder()
@NoArgsConstructor()
@AllArgsConstructor()
@Getter()
@Setter()
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_uuid", unique = true)
    private String userUuid;

    @Column(name = "username", unique = true)
    private String userName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "is_active")
    private Boolean is_active;

    @Column(name = "is_verified")
    private Boolean is_verified;

    @Column(name = "created_at")
    private Boolean created_at;

    @Column(name = "updated_at")
    private Boolean updated_at;

}
