package com.springboot.backend.gestiondeinventarios.services;

import com.springboot.backend.gestiondeinventarios.models.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    Product findById(Long id);

    Product create(Product product);

    Product update(Product product);

    void delete(Product product);

}
