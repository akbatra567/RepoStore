package com.buildingforfun.Repo.Store.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @OneToOne(optional = false, orphanRemoval = true)
  @JoinColumn(name = "product_id", nullable = false, unique = true)
  private Product product;

  @Column(name = "quantity", nullable = false)
  private Integer quantity;
}
