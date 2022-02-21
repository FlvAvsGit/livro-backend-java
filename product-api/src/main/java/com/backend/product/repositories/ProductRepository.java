package com.backend.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
