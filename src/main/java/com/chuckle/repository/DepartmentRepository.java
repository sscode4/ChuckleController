package com.chuckle.repository;

import com.chuckle.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Departments, Long> {

    // Additional query methods (if needed) can be added here

}