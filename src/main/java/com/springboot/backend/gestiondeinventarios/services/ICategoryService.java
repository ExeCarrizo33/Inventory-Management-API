package com.springboot.backend.gestiondeinventarios.services;

import com.springboot.backend.gestiondeinventarios.models.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();

    Category create(Category category);

    Category update(Category category);

    void delete(Category category);


}
