package com.example.orderprocessingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProcessingRepo extends JpaRepository {
    String createPackingSlip();
}
