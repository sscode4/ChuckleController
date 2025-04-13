package com.chuckle.items.service.Interface;


import com.chuckle.items.model.Processor;
import org.springframework.stereotype.Service;


@Service
public interface ProcessorService {

    Processor getProcessorById(Long id);

}
