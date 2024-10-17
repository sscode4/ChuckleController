package com.chuckle.repository;


import com.chuckle.model.Departments;
import com.chuckle.model.Processor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorRepository extends JpaRepository<Processor, Long> {



}
