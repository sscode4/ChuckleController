package com.chuckle.resource.departments;


import com.chuckle.security.domain.ApiResponse;
import com.chuckle.model.Departments;
import com.chuckle.service.Interface.DepartmentService;
import com.chuckle.service.impl.service.coolingSystemService.CoolingSystemServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentsController {

    private Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    DepartmentService departmentServiceImpl;


    @Autowired
    CoolingSystemServiceImpl coolingSystemServiceImpl;

        @GetMapping("/departments")
        public ResponseEntity<ApiResponse<Departments>> getDepartmentById(@PathVariable Long id) {
             Departments department = departmentServiceImpl.getDepartmentById(id);

            if (department != null) {
                ApiResponse<Departments> response = new ApiResponse<>("Success 200", "Department found", department);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                ApiResponse<Departments> response = new ApiResponse<>("error 404 NotFound", "Department not found", null);
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }
        }


    }
