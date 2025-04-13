package com.chuckle.items.service.impl.service.coolingSystemService;

import com.chuckle.items.model.CustomCoolingSystem;
import com.chuckle.items.repository.CoolingSystemRepository;
import com.chuckle.items.service.Interface.CoolingSystemService;
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


