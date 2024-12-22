package com.example.ims_dbms.repositories;

import com.example.ims_dbms.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
