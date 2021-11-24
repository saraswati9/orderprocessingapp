package com.example.orderprocessingapp.service;

import com.example.orderprocessingapp.model.PackingSlip;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessingService {

    public String createPackingSlip() {
        return "PackingSlip";
    }
}
