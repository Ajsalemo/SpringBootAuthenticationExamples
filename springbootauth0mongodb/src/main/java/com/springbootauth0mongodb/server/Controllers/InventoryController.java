package com.springbootauth0mongodb.server.Controllers;

import java.util.Optional;

import com.springbootauth0mongodb.server.Entities.InventoryEntity;
import com.springbootauth0mongodb.server.Repository.InventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    // Retrieve all inventory
    @GetMapping("/find_all_inventory")
    public Iterable<InventoryEntity> findAllInventory() {
        return inventoryRepository.findAll();
    }

    // Find an item by ID
    @GetMapping("/inventory/{id}")
    public InventoryEntity findInventoryById(@PathVariable String id) throws Exception {
        return inventoryRepository.findById(id).orElseThrow(() -> new Exception("Item not found with ID:" + id));
    }
}
