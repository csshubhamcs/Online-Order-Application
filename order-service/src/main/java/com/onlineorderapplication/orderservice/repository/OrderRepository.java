package com.onlineorderapplication.orderservice.repository;

import com.onlineorderapplication.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
