package com.chuckle.service.Interface;


import com.chuckle.model.Departments;
import com.chuckle.model.Processor;
import org.springframework.stereotype.Service;


@Service
public interface ProcessorService {

    Processor getProcessorById(Long id);

}
