package com.example.orderprocessingapp.controller;

import com.example.orderprocessingapp.model.PackingSlip;
import com.example.orderprocessingapp.model.Payment;
import com.example.orderprocessingapp.model.Product;
import com.example.orderprocessingapp.service.OrderProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/payment")
public class OrderProcessingController {

    @Autowired
    private OrderProcessingService ops;

    @PostMapping("/{productName}")
    public PackingSlip createPackingSlip(@RequestBody Payment payment, @PathVariable String productName) {
        if (productName.equalsIgnoreCase("physical product")) {
            ops.makeCommissionPaymentToAgent(productName);
            return ops.createPackingSlip(payment, productName);
        } else if (productName.equalsIgnoreCase("book")) {
            ops.makeCommissionPaymentToAgent(productName);
            return ops.getDuplicatePackingSlip();
        } else {
            return ops.createPackingSlip(payment, productName);
        }
    }

    @PutMapping("/activate")
    public void activateMembership(@PathVariable String activate) {
        ops.activateMembership();
        ops.sendEmail("Your membership got activated");
    }

    @PutMapping("/upgradeToMembership")
    public void upgradeToMembership() {
        ops.upgradeToMembership();
        ops.sendEmail("Upgraded to membership");
    }

    @PostMapping("/video/{videoName}")
    public PackingSlip createPackingSlipForVideo(@RequestBody Payment payment, @PathVariable String videoName) {
        if (videoName.equalsIgnoreCase("Learning to Ski")) {
            Product video1 = ops.getProductByName(videoName);
            Product video2 = ops.getProductByName("First Aid");
            List<Product> productList = Arrays.asList(video1, video2);

            return ops.createPackingSlipForVideo(payment, productList);
        } else {
            return ops.createPackingSlip(payment, videoName);
        }
    }
}
