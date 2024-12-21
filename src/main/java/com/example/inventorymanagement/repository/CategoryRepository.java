package com.example.inventorymanagement.repository;

import com.example.inventorymanagement.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
