package com.springboot.backend.gestiondeinventarios.controllers;

import com.springboot.backend.gestiondeinventarios.models.Product;
import com.springboot.backend.gestiondeinventarios.services.Impl.ProductServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {

        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> findAllBy(Long id) {

        return productService.findById(id);
    }

    @PostMapping("/save")
    public Product save(@Valid @RequestBody Product product) {

        return productService.create(product);
    }

    @PatchMapping("/update/{id}")
    public Product update(@Valid @PathVariable Long id, @RequestBody Product product) {

        return productService.update(product, id);

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }


}
