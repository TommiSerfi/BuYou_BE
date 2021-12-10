package com.buyou.BuYou.controller;

import com.buyou.BuYou.entity.Purchase;
import com.buyou.BuYou.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public @ResponseBody List<Purchase> getAllPurchase() {
        return purchaseService.getAllPurchase();
    }

    @GetMapping(value = "/date")
    public @ResponseBody ResponseEntity getPurchaseByDate(@RequestParam Date purchaseDate) {
        return ResponseEntity.ok(purchaseService.findByPurchaseDate(purchaseDate));
    }

}
