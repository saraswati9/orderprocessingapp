package com.example.orderprocessingapp;

import com.example.orderprocessingapp.model.PackingSlip;
import com.example.orderprocessingapp.model.Payment;
import com.example.orderprocessingapp.model.Product;
import com.example.orderprocessingapp.service.OrderProcessingService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

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

    @Test
    public void testActivateMembership() {
        when(ops.activateMembership()).thenReturn(true);
        assertEquals(true, ops.activateMembership());
    }

    @Test
    public void testUpgradeToMembership() {
        when(ops.upgradeToMembership()).thenReturn(true);
        assertEquals(true, ops.upgradeToMembership());

    }

    @Test
    public void testCreatePackingSlipForVideo() {
        Payment payment = new Payment(Long.valueOf(1L), "Online", 1000.00);
        Product product1 = new Product("222", "video", "Learning to Ski", 1000.00);
        Product product2 = new Product("333", "video", "First Aid", 500.00);
        List<Product> productList = Arrays.asList(product1, product2);
        PackingSlip ps = new PackingSlip(productList);
        when(ops.createPackingSlipForVideo(payment, productList)).thenReturn(ps);
        assertEquals(ps, ops.createPackingSlipForVideo(payment, productList));
    }


}
