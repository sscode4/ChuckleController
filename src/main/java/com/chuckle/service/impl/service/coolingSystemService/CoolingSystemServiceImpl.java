package com.chuckle.service.impl.service.coolingSystemService;

import com.chuckle.model.CustomCoolingSystem;
import com.chuckle.repository.CoolingSystemRepository;
import com.chuckle.service.Interface.CoolingSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.hibernate.bytecode.BytecodeLogger.LOGGER;

@Service
public class CoolingSystemServiceImpl implements CoolingSystemService {

    @Autowired
    CoolingSystemRepository coolingSystemRepository;

    @Override
    public CustomCoolingSystem getAllCoolingSystem(Long id) {
        CustomCoolingSystem coolingSystem = coolingSystemRepository.findById(id).get();
        LOGGER.info("getDepartmentById "+ coolingSystem);
        return coolingSystem;
    }
}


