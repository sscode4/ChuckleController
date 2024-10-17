package com.chuckle.service.impl.service.departmentService;


import com.chuckle.model.Departments;
import com.chuckle.repository.DepartmentRepository;
import com.chuckle.service.Interface.DepartmentService;
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
