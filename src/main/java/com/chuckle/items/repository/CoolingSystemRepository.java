package com.chuckle.items.repository;

import com.chuckle.items.model.CustomCoolingSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoolingSystemRepository  extends JpaRepository<CustomCoolingSystem, Long> {
}
