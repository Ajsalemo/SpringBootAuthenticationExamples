package com.springbootauth0mongodb.server.Entities;

import org.springframework.data.annotation.Id;

public class InventoryEntity {

    @Id
    public String id;

    public String item;
    public Integer qty;

    public void Inventory(String item, Integer qty) {
        this.item = item;
        this.qty = qty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}