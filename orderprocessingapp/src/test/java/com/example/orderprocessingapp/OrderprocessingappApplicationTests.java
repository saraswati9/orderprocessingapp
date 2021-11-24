package com.example.orderprocessingapp;

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
        String str = "PackingSlip";
        when(ops.createPackingSlip()).thenReturn(str);
        assertEquals("PackingSlip", str);
    }


}
