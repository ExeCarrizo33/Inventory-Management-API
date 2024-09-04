package com.springboot.backend.gestiondeinventarios.services.Impl;


import com.springboot.backend.gestiondeinventarios.models.Inventory;
import com.springboot.backend.gestiondeinventarios.repository.InventoryRepository;
import com.springboot.backend.gestiondeinventarios.services.IInvetoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class InventoryServiceImpl implements IInvetoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Inventory> findById(Long id) {

        return inventoryRepository.findById(id);
    }

    @Override
    @Transactional
    public Inventory update(Inventory inventory, Long id) {

        Optional<Inventory> inventoryUpdate = inventoryRepository.findById(id);

        inventoryUpdate.ifPresent(inv -> inv.setStock(inventory.getStock()));

        return inventoryRepository.save(inventoryUpdate.get());

    }
}
