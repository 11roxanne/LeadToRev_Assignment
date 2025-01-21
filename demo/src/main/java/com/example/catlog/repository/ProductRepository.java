package com.example.catlog.repository;

import com.example.catlog.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    // Find products by name containing a keyword, case insensitive, with pagination
    Page<Product> findByNameContainingIgnoreCase(String name, Pageable pageable);

    // Find products by categories containing a keyword, case insensitive, with
    // pagination
    @Query("{ 'categories': { $regex: ?0, $options: 'i' } }")
    Page<Product> findByCategoriesContainingIgnoreCase(String category, Pageable pageable);

    // Find products by specific attribute key and value, case insensitive
    @Query("{ 'attributes.key': ?0, 'attributes.value': { $regex: ?1, $options: 'i' } }")
    List<Product> findByAttributesKeyAndAttributesValueIgnoreCase(String key, String value);

    // Find products with availability status
    @Query("{ 'availability.status': ?0 }")
    List<Product> findByAvailabilityStatus(String status);

}
