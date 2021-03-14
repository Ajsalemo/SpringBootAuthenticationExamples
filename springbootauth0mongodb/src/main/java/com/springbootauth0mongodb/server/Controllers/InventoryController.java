package com.springbootauth0mongodb.server.Controllers;

import com.springbootauth0mongodb.server.Entities.InventoryEntity;
import com.springbootauth0mongodb.server.Repository.InventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    // Add an item
    @PostMapping("/add_inventory")
    public ResponseEntity<InventoryEntity> addInventory(@RequestBody InventoryEntity newInventoryAdded) {
        InventoryEntity _getNewInventoryAdded = newInventoryAdded;
        // Getters
        _getNewInventoryAdded.getName();
        _getNewInventoryAdded.getTags();
        _getNewInventoryAdded.getQuantity();
        _getNewInventoryAdded.getPrice();
        // Save the incoming data to the database through the repository
        InventoryEntity savedInventory = inventoryRepository.save(_getNewInventoryAdded);
        // Return with a HTTP 201(created) and the new Object on the response
        return new ResponseEntity<InventoryEntity>(savedInventory, HttpStatus.CREATED);

    }
}
