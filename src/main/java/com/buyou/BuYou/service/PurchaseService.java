package com.buyou.BuYou.service;

import com.buyou.BuYou.entity.Purchase;
import com.buyou.BuYou.repository.PurchaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAllPurchase() {
        return purchaseRepository.findAll();
    }

    public List<Purchase> findByPurchaseDate(Date purchaseDate) {
        List<Purchase> result = purchaseRepository.findByPurchaseDate(purchaseDate);
        return result;
    }

}
