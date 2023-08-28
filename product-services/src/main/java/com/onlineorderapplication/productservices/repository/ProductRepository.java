package com.onlineorderapplication.productservices.repository;

import com.onlineorderapplication.productservices.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {

}
