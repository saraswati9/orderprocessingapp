package com.example.orderprocessingapp.repository;

import com.example.orderprocessingapp.model.PackingSlip;
import com.example.orderprocessingapp.model.Payment;
import com.example.orderprocessingapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderProcessingRepo extends JpaRepository {
    String createPackingSlip();

    PackingSlip createPackingSlip(Payment payment, String productName);

    PackingSlip getPackingSlipById(Long valueOf);

    boolean activateMembership();

    boolean upgradeToMembership();

    PackingSlip createPackingSlipForVideo(Payment payment, List<Product> productList);

    Product getProductByName(String videoName);
}
