package com.springboot.backend.gestiondeinventarios.services;

import com.springboot.backend.gestiondeinventarios.models.Inventory;

import java.util.Optional;


public interface IInvetoryService {

    Optional<Inventory> findById(Long id);

    Inventory update(Inventory inventory, Long id);

}
