package com.chuckle.items.repository;

import com.chuckle.items.model.CustomCoolingSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomCoolingSystemRepository extends JpaRepository<CustomCoolingSystem, Long> {

    // Additional query methods (if needed) can be added here

}