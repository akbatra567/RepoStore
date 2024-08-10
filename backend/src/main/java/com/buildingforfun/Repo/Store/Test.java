package com.buildingforfun.Repo.Store;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Test {

    @Id
    private long Id;

    @Column
    private String userName;
}
