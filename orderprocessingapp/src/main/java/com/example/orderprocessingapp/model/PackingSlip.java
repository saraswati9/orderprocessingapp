package com.example.orderprocessingapp.model;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class PackingSlip {

    @Id
    private Long psId;
    private String productId;
    private String productType;
    private String productName;
    private Double productPrice;

    @Transient
    private Product product;

    public PackingSlip(Long psId) {
        this.psId = psId;
    }

    public PackingSlip(Product product) {
        this.psId = psId;
        this.productId = product.getProductId();
        this.productType = product.getProductType();
        this.productName = product.getProductName();
        this.productPrice = product.getProductPrice();
    }

    public PackingSlip(List<Product> productList) {
        Double price = 0.0;
        for(Product p : productList) {
            Double d = p.getProductPrice();
            price = price + d;
        }
        this.productPrice = price;
    }
}
