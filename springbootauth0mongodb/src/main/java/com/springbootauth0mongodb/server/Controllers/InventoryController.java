package com.springbootauth0mongodb.server.Controllers;

import com.springbootauth0mongodb.server.Entities.InventoryEntity;
import com.springbootauth0mongodb.server.Repository.InventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("/find_all_inventory")
    public Iterable<InventoryEntity> findAllInventory() {
        return inventoryRepository.findAll();
    }
}
