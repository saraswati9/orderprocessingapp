package com.example.orderprocessingapp.service;

import com.example.orderprocessingapp.model.PackingSlip;
import com.example.orderprocessingapp.model.Payment;
import com.example.orderprocessingapp.model.Product;
import com.example.orderprocessingapp.repository.OrderProcessingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return opr.activateMembership();
    }

    public boolean upgradeToMembership() {
        return opr.upgradeToMembership();
    }

    public PackingSlip createPackingSlipForVideo(Payment payment, List<Product> productList) {
        return opr.createPackingSlipForVideo(payment, productList);
    }

    public Product getProductByName(String videoName) {
        return opr.getProductByName(videoName);
    }

    public void makeCommissionPaymentToAgent(String productName) {
        Double commission = opr.getAgentCommissionByProductName(productName);
        opr.makeCommissionPaymentToAgent(commission);
    }

    public void sendEmail(String your_membership_got_activated) {
    }
}
