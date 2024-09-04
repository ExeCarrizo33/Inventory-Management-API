package com.springboot.backend.gestiondeinventarios.repository;

import com.springboot.backend.gestiondeinventarios.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
