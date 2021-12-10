package com.buyou.BuYou.repository;

import com.buyou.BuYou.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findAll();

    List<Order> findByOrderDate(Date order_date);
}
