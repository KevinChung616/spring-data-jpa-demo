package com.jtsp.springdatajpademo.repository;

import com.jtsp.springdatajpademo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
