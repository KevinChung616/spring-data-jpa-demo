package com.jtsp.springdatajpademo.service;

import com.jtsp.springdatajpademo.model.entity.Product;
import com.jtsp.springdatajpademo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product)  {
        return productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public Boolean deleteProductById(Long id) {
        productRepository.deleteById(id);
        return true;
    }

}
