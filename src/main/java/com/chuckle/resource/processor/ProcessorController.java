package com.chuckle.resource.processor;


import com.chuckle.model.Departments;
import com.chuckle.model.Processor;
import com.chuckle.security.domain.ApiResponse;
import com.chuckle.service.impl.service.processorService.ProcessorServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// The @RestController annotation was introduced in Spring 4.0 to simplify the creation of RESTful web services.
// It’s a convenience annotation that combines @Controller and @ResponseBody –
// which eliminates the need to annotate every request handling method of the controller class with the @ResponseBody annotation.
@RestController
public class ProcessorController {

    private Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    ProcessorServiceImpl processorService;


    @GetMapping("/processors")
    public ResponseEntity<ApiResponse<Processor>> getProcessorById(@PathVariable Long id) {
        Processor processor = processorService.getProcessorById(id);

        if (processor != null) {
            ApiResponse<Processor> response = new ApiResponse<>("Success 200", "Department found", processor);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            ApiResponse<Processor> response = new ApiResponse<>("error 404 NotFound", "Department not found", null);
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }
}
