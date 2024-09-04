package com.springboot.backend.gestiondeinventarios.services.Impl;

import com.springboot.backend.gestiondeinventarios.models.Category;
import com.springboot.backend.gestiondeinventarios.repository.CategoryRepository;
import com.springboot.backend.gestiondeinventarios.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<Category> findAll() {

        return categoryRepository.findAll();
    }

    @Override
    public Category create(Category category) {

        return categoryRepository.save(category);
    }

    @Override
    public Category update(Category category, Long id) {

        Optional<Category> categoriesUpdate = categoryRepository.findById(id);

        categoriesUpdate.ifPresent(category1 -> category1.setName(category.getName()));

        return categoryRepository.save(categoriesUpdate.get());
    }

    @Override
    public void deleteById(Long id) {
        this.categoryRepository.deleteById(id);
    }


}
