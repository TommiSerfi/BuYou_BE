package com.buyou.BuYou.service;

import com.buyou.BuYou.model.Order;
import com.buyou.BuYou.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public List<Order> findOrderByDate(Date order_date) {
        List<Order> result = orderRepository.findByOrderDate(order_date);
        return result;
    }

}
