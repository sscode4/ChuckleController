package com.chuckle.service.impl.service.processorService;

import com.chuckle.model.Departments;
import com.chuckle.model.Processor;
import com.chuckle.repository.DepartmentRepository;
import com.chuckle.repository.ProcessorRepository;
import com.chuckle.service.Interface.DepartmentService;
import com.chuckle.service.Interface.ProcessorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessorServiceImpl implements ProcessorService {

    @Autowired
    ProcessorServiceImpl departmentRepository;


    @Autowired
    ProcessorRepository processorRepository;

    private Logger LOGGER = LoggerFactory.getLogger(getClass());


   @Override
    public Processor getProcessorById(Long id) {
      Processor processor = processorRepository.findById(id).get();
      return  processor;
    }
}
