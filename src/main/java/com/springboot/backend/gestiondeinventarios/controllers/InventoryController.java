package com.springboot.backend.gestiondeinventarios.controllers;

import com.springboot.backend.gestiondeinventarios.models.Inventory;
import com.springboot.backend.gestiondeinventarios.services.Impl.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryServiceImpl inventoryService;

    @GetMapping("/{productId}")
    public Optional<Inventory> findByProductId(@PathVariable Long productId) {

        return inventoryService.findById(productId);
    }

    @PatchMapping("/update/{productId}")
    public Inventory update(@RequestBody Inventory inventory, @PathVariable Long productId) {

        return inventoryService.update(inventory, productId);

    }


}
