package com.example.orderprocessingapp.controller;

import com.example.orderprocessingapp.model.PackingSlip;
import com.example.orderprocessingapp.model.Payment;
import com.example.orderprocessingapp.service.OrderProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payment")
public class OrderProcessingController {

    @Autowired
    private OrderProcessingService ops;

    @PostMapping("/{productName}")
    public PackingSlip createPackingSlip(@RequestBody Payment payment, @PathVariable String productName) {
        if (productName.equalsIgnoreCase("physical product")) {
            return ops.createPackingSlip(payment, productName);
        } else if (productName.equalsIgnoreCase("book")) {
            return ops.getDuplicatePackingSlip();
        } else {
            return ops.createPackingSlip(payment, productName);
        }
    }

    @PutMapping("/activate")
    public void activateMembership(@PathVariable String activate) {
        ops.activateMembership();
    }

    @PutMapping("/upgradeToMembership")
    public void upgradeToMembership() {
        ops.upgradeToMembership();
    }
}
