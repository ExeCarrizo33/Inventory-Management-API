package com.springboot.backend.gestiondeinventarios.services.Impl;

import com.springboot.backend.gestiondeinventarios.models.Category;
import com.springboot.backend.gestiondeinventarios.repository.CategoryRepository;
import com.springboot.backend.gestiondeinventarios.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Category> findAll() {

        return categoryRepository.findAll();
    }

    @Override
    @Transactional
    public Category create(Category category) {

        return categoryRepository.save(category);
    }

    @Override
    @Transactional
    public Category update(Category category, Long id) {

        Optional<Category> categoriesUpdate = categoryRepository.findById(id);

        categoriesUpdate.ifPresent(cat -> cat.setName(category.getName()));

        return categoryRepository.save(categoriesUpdate.get());
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        this.categoryRepository.deleteById(id);
    }


}
