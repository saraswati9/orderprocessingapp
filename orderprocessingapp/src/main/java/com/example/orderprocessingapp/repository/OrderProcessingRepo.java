package com.example.orderprocessingapp.repository;

import com.example.orderprocessingapp.model.PackingSlip;
import com.example.orderprocessingapp.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProcessingRepo extends JpaRepository {
    String createPackingSlip();

    PackingSlip createPackingSlip(Payment payment, String productName);

    PackingSlip getPackingSlipById(Long valueOf);

    String activateMembership();
}
