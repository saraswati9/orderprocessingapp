package com.example.orderprocessingapp.service;

import com.example.orderprocessingapp.model.PackingSlip;
import com.example.orderprocessingapp.model.Payment;
import com.example.orderprocessingapp.repository.OrderProcessingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessingService {

    @Autowired
    private OrderProcessingRepo opr;

    public String createPackingSlip() {
        return "PackingSlip";
    }

    public PackingSlip createPackingSlip(Payment payment, String productName) {
        return opr.createPackingSlip(payment, productName);
    }

    public PackingSlip getDuplicatePackingSlip() {
        return opr.getPackingSlipById(Long.valueOf(1L));
    }

    public boolean activateMembership() {
        return true;
    }

    public boolean upgradeToMembership() {
        return true;
    }
}
