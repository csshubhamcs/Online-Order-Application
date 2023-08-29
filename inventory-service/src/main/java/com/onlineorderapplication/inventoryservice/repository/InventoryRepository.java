package com.onlineorderapplication.inventoryservice.repository;

import com.onlineorderapplication.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {

   List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
