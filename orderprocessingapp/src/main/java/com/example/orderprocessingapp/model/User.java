package com.example.orderprocessingapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private Long userId;
    private String userName;
    private String userEmail;
    private Boolean activateFlag;
    private Boolean membershipFlag;




}
