package com.springboot.backend.gestiondeinventarios.services;

import com.springboot.backend.gestiondeinventarios.models.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product create(Product product);

    Product update(Product product, Long id);

    void delete(Product product);

}
