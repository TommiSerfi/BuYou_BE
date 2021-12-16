package com.buyou.BuYou.controller;

import com.buyou.BuYou.entity.Product;
import com.buyou.BuYou.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.findAllProducts();
    }

    @PostMapping("/new")
    public @ResponseBody
    String createProduct(@RequestBody Product product) {
        productService.newProduct(product);
        return "Product added";
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Long> deleteProductById(@PathVariable Long id) {
        /*        boolean isRemoved = */
        productService.deleteProductById(id);

//        if (!isRemoved) {
//            throw new ResourceNotFoundException();
//        }
//
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public String updateProduct(@PathVariable(value = "id") Long id,
                             @RequestBody Product productDetails) {
        productService.updateProduct(id, productDetails);
        return "Product updated";
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.findProductById(id));
    }

    @GetMapping("/findByTitle/{title}")
    public ResponseEntity getProductByTitle(@PathVariable String title) {
        return ResponseEntity.ok(productService.findProductByTitle(title));
    }

    @GetMapping("/sortByPriceAsc")
    public List<Product> getAllProductsSortByPriceAsc() {
        return productService.findAllProductsSortByPriceAsc();
    }

    @GetMapping("/sortByPriceDesc")
    public List<Product> getAllProductsSortByPriceDesc() {
        return productService.findAllProductsSortByPriceDesc();
    }

    @GetMapping(value = "/sortByCategoryAsc")
    public List<Product> getAllProductsSortByCategoryAsc() {
        return productService.findAllProductsSortByCategoryAsc();
    }

    @GetMapping(value = "/sortByCategoryDesc")
    public List<Product> getAllProductsSortByCategoryDesc() {
        return productService.findAllProductsSortByCategoryDesc();
    }

}
