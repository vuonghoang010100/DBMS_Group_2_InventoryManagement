package com.example.ims_dbms.repositories;

import com.example.ims_dbms.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
