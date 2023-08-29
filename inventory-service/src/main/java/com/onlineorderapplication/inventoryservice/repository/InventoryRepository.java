package com.onlineorderapplication.inventoryservice.repository;

import com.onlineorderapplication.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {

    Optional<Inventory> findBySkuCode();

}
