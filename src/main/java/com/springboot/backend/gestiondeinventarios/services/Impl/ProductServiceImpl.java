package com.springboot.backend.gestiondeinventarios.services.Impl;

import com.springboot.backend.gestiondeinventarios.models.Category;
import com.springboot.backend.gestiondeinventarios.models.Product;
import com.springboot.backend.gestiondeinventarios.repository.CategoryRepository;
import com.springboot.backend.gestiondeinventarios.repository.ProductRepository;
import com.springboot.backend.gestiondeinventarios.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Product> findAll() {

        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {

        return productRepository.findById(id);
    }

    @Override
    public Product create(Product product) {

        return productRepository.save(product);
    }

    @Override
    public Product update(Product product, Long id) {
        Optional<Product> productUpdate = productRepository.findById(id);

        productUpdate.ifPresent(prod -> prod
                .setName(product.getName())
                .setDescription(product.getDescription())
                .setPrice(product.getPrice())

        );

        return productRepository.save(product);

    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);

    }
}
