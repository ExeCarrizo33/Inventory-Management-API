package com.springboot.backend.gestiondeinventarios.repository;

import com.springboot.backend.gestiondeinventarios.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
