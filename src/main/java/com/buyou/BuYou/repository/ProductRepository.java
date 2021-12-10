package com.buyou.BuYou.repository;

import com.buyou.BuYou.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAll();

    public List<Product> findAllByOrderByPriceAsc();

    public List<Product> findAllByOrderByPriceDesc();

    public List<Product> findAllByOrderByCategoryAsc();

    public List<Product> findAllByOrderByCategoryDesc();

    Optional<Product> findById(Long id);

    void deleteById(Long id);

    List<Product> findByTitle(String title);

    List<Product> findByPrice(String price);

    List<Product> findByCategory(String category);

}
