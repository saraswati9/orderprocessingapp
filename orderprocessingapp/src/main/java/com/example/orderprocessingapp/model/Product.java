package com.example.orderprocessingapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    private String productId;
    private String productType;
    private String productName;
    private Double productPrice;

    public Product(String productId, String productType, String productName, Double productPrice) {
        this.productId = productId;
        this.productType = productType;
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
