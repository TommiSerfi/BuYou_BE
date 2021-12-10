package com.buyou.BuYou.controller;

import com.buyou.BuYou.model.Order;
import com.buyou.BuYou.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return orderService.findAllOrders();
    }

    @GetMapping(value = "/orderByDate/{order_date}")
    public ResponseEntity getOrderByDate(@PathVariable Date order_date) {
        return ResponseEntity.ok(orderService.findOrderByDate(order_date));
    }

}
