package com.chuckle.service.Interface;


import com.chuckle.model.Departments;
import org.springframework.stereotype.Service;


public interface DepartmentService {

    Departments getDepartmentById(Long id);


}
