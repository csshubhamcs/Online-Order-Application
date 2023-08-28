package com.onlineorderapplication.orderservice.service;

import com.onlineorderapplication.orderservice.dto.OrderLineItemsDto;
import com.onlineorderapplication.orderservice.dto.OrderRequest;
import com.onlineorderapplication.orderservice.model.Order;
import com.onlineorderapplication.orderservice.model.OrderLineItems;
import com.onlineorderapplication.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;


    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();

        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItemsList =   orderRequest.getOrderLineItemsDtoList().stream()
        .map(this::mapToDto)
        .toList();

        order.setOrderLineItems(orderLineItemsList);
        orderRepository.save(order);

    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
    }
}
