package com.springboot.backend.gestiondeinventarios.controllers;

import com.springboot.backend.gestiondeinventarios.models.Category;
import com.springboot.backend.gestiondeinventarios.services.Impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @GetMapping("/all")
    public List<Category> findAll() {

        return categoryServiceImpl.findAll();

    }

    @PostMapping("/save")
    public Category save(@RequestBody Category category) {

        return categoryServiceImpl.create(category);
    }

    @PatchMapping("/update/{category_id}")
    public Category update(@PathVariable Long category_id, @RequestBody Category category) {

        return categoryServiceImpl.update(category, category_id);
    }

    @DeleteMapping("/delete/{category_id}")
    public void delete(@PathVariable Long category_id) {
        categoryServiceImpl.deleteById(category_id);
    }

}
