package com.chuckle.repository;

import com.chuckle.model.CustomCoolingSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoolingSystemRepository  extends JpaRepository<CustomCoolingSystem, Long> {
}
