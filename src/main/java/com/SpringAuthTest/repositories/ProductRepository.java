package com.SpringAuthTest.repositories;

import com.SpringAuthTest.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
