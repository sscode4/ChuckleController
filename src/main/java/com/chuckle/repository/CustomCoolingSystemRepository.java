package com.chuckle.repository;

import com.chuckle.model.CustomCoolingSystem;
import com.chuckle.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomCoolingSystemRepository extends JpaRepository<CustomCoolingSystem, Long> {

    // Additional query methods (if needed) can be added here

}