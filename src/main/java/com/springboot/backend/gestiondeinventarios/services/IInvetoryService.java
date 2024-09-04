package com.springboot.backend.gestiondeinventarios.services;

import com.springboot.backend.gestiondeinventarios.models.Inventory;

public interface IInvetoryService {

    Inventory findById(Long id);

    Inventory update(Inventory inventory);

}
