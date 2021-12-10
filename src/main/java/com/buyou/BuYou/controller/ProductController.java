package com.buyou.BuYou.controller;

import com.buyou.BuYou.model.Product;
import com.buyou.BuYou.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.findAllProducts();
    }

    @PostMapping("/products")
    public @ResponseBody
    String createProduct(@RequestBody Product product) {
        productService.newProduct(product);
        return "Product added";
    }

    @GetMapping("/productsSortByPriceAsc")
    public List<Product> getAllProductsSortByPriceAsc() {
        return productService.findAllProductsSortByPriceAsc();
    }

    @GetMapping("/productsSortByPriceDesc")
    public List<Product> getAllProductsSortByPriceDesc() {
        return productService.findAllProductsSortByPriceDesc();
    }

    @GetMapping("/productsSortByCategoryAsc")
    public List<Product> getAllProductsSortByCategoryAsc() {
        return productService.findAllProductsSortByCategoryAsc();
    }

    @GetMapping("/productsSortByCategoryDesc")
    public List<Product> getAllProductsSortByCategoryDesc() {
        return productService.findAllProductsSortByCategoryDesc();
    }

    @GetMapping(value = "/productById/{id}")
    public ResponseEntity getProductById(@PathVariable Integer id) {
        return ResponseEntity.ok(productService.findProductById(id));
    }

    @DeleteMapping(value = "/products/{id}")
    public ResponseEntity<Integer> deleteProductById(@PathVariable Integer id) {
        /*        boolean isRemoved = */
        productService.deleteProductById(id);

//        if (!isRemoved) {
//            throw new ResourceNotFoundException();
//        }
//
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PutMapping("/products/{id}")
    public String updateProduct(@PathVariable(value = "id") Integer id,
                             @RequestBody Product productDetails) {
        productService.updateProduct(id, productDetails);
        return "Product updated";
    }

    @GetMapping(value = "/productByTitle/{title}")
    public ResponseEntity getProductByTitle(@PathVariable String title) {
        return ResponseEntity.ok(productService.findProductByTitle(title));
    }

}
