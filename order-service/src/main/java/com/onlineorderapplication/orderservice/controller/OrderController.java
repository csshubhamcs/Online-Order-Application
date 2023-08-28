package com.onlineorderapplication.orderservice.controller;

import com.onlineorderapplication.orderservice.dto.OrderRequest;
import com.onlineorderapplication.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order placed Successfully";
    }
}
