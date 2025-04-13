package com.chuckle.items.productResource.coolingSystem;

import com.chuckle.items.model.CustomCoolingSystem;
import com.chuckle.security.domain.ApiResponse;
import com.chuckle.items.service.Interface.CoolingSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CoollingSytemController {

    @Autowired
    CoolingSystemService coolingSystemServiceImpl;


    @GetMapping("/customCoolingSystem")
    public ResponseEntity<ApiResponse<CustomCoolingSystem>> getCustomCoolingSystem(@PathVariable Long id) {
        CustomCoolingSystem customCoolingSystem = coolingSystemServiceImpl.getAllCoolingSystem(id);

        if (customCoolingSystem != null) {
            ApiResponse<CustomCoolingSystem> response = new ApiResponse<>("Success 200", "Department found", customCoolingSystem);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            ApiResponse<CustomCoolingSystem> response = new ApiResponse<>("error 404 NotFound", "Department not found", null);
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }
}
