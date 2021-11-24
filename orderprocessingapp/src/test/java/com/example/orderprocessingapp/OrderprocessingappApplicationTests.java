package com.example.orderprocessingapp;

import com.example.orderprocessingapp.model.PackingSlip;
import com.example.orderprocessingapp.model.Payment;
import com.example.orderprocessingapp.model.Product;
import com.example.orderprocessingapp.repository.OrderProcessingRepo;
import com.example.orderprocessingapp.service.OrderProcessingService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderprocessingappApplicationTests {

    @MockBean
    private OrderProcessingService ops;

    @Test
    public void testCreatePackingSlip() {
        Payment payment = new Payment(Long.valueOf(1L), "Online", 10000.00);
        Product product = new Product("product1", "physical product", "TV", 15000.00);
        PackingSlip ps = new PackingSlip(product);
        when(ops.createPackingSlip(payment, "physical product")).thenReturn(ps);
        assertEquals(ps, ops.createPackingSlip(payment, "physical product"));
    }


}
