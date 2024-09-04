package com.springboot.backend.gestiondeinventarios.repository;

import com.springboot.backend.gestiondeinventarios.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}
