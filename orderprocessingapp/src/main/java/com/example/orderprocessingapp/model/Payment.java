package com.example.orderprocessingapp.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Payment {

    @Id
    private Long paymentId;
    private String paymentType;
    private Double paymentAmount;

    public Payment(Long paymentId, String paymentType, Double paymentAmount) {
        this.paymentId = paymentId;
        this.paymentType = paymentType;
        this.paymentAmount = paymentAmount;
    }
}
