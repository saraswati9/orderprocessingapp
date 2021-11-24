package com.example.orderprocessingapp.config;

import com.example.orderprocessingapp.impl.OrderProcessingRepoImpl;
import com.example.orderprocessingapp.repository.OrderProcessingRepo;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories
@EntityScan("com.example.orderprocessingapp.model")
@ComponentScan("com.example.orderprocessingapp")
public class ApplicationContextConfiguration {

    @Bean
    public OrderProcessingRepo getOrderProcessingRepoBean() {
        return new OrderProcessingRepoImpl();
    }
}
