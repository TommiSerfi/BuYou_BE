package com.buyou.BuYou.service;
import com.buyou.BuYou.exception.ResourceNotFoundException;
import com.buyou.BuYou.model.Product;
import com.buyou.BuYou.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void newProduct(Product product) {
        Product p = product;
/*        if (null != title && null != author && null != price && null != category && null != quantity) {
            for (product prodCheck : productRepository.findAll()) {
                if (prodCheck.getTitle() == p.getTitle()) {
                    System.out("Libro già esistente in magazzino");
                }
                else {
                    check = true;
                }
            }
            if (check) {*/
                productRepository.save(p);
/*            }
        }*/
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> findAllProductsSortByPriceAsc() {
        return productRepository.findAllByOrderByPriceAsc();
    }

    public List<Product> findAllProductsSortByPriceDesc() {
        return productRepository.findAllByOrderByPriceDesc();
    }

    public List<Product> findAllProductsSortByCategoryAsc() {
        return productRepository.findAllByOrderByCategoryAsc();
    }

    public List<Product> findAllProductsSortByCategoryDesc() {
        return productRepository.findAllByOrderByCategoryDesc();
    }

    public Optional<Product> findProductById(Integer id) {
        Optional<Product> result = productRepository.findById(id);
        return result;
    }

    public void deleteProductById(Integer id) {
        Optional<Product> product = productRepository.findById(id);
        if (!product.isPresent()){
            throw new ResourceNotFoundException();
        }
        productRepository.deleteById(id);
    }

    public void updateProduct(Integer id, Product productDetails) {
        Product product = findProductById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
        product.setTitle(productDetails.getTitle());
        product.setAuthor(productDetails.getAuthor());
        product.setPrice(productDetails.getAuthor());
        product.setCategory(productDetails.getCategory());

        /* Product updatedProduct = */ productRepository.save(product);
        /* return updatedProduct; */
    }

    public List<Product> findProductByTitle(String title) {
        List<Product> result = productRepository.findByTitle(title);
        return result;
    }

    public List<Product> findProductByCategory(String category) {
        List<Product> result = productRepository.findByCategory(category);
        return result;
    }

}
