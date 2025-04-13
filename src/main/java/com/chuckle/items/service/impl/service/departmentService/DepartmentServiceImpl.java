package com.chuckle.items.service.impl.service.departmentService;


import com.chuckle.items.model.Departments;
import com.chuckle.items.repository.DepartmentRepository;
import com.chuckle.items.service.Interface.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository  departmentRepository;

    private Logger LOGGER = LoggerFactory.getLogger(getClass());


    @Override
    public Departments getDepartmentById(Long id) {
        Departments departments = departmentRepository.findById(id).get();
        LOGGER.info("getDepartmentById "+ departments);
        return departments;
    }
}
