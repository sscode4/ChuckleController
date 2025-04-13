package com.chuckle.items.service.impl.service.processorService;

import com.chuckle.items.model.Processor;
import com.chuckle.items.repository.ProcessorRepository;
import com.chuckle.items.service.Interface.ProcessorService;
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
