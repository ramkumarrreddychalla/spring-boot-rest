package com.quardratic.equation.solver.controller;

import com.quardratic.equation.solver.request.EquationSolverRequest;
import com.quardratic.equation.solver.request.Greeting;
import com.quardratic.equation.solver.service.EquationSolveService;
import com.quardratic.equation.solver.service.exception.EquationSyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/equationsolver")
public class EquationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EquationController.class);

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value= "/greeting", method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        LOGGER.debug(" logging to test");
        System.out.println(" hello ");
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }


    @Autowired
    EquationSolveService equationSolveService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> getEquation(@RequestBody EquationSolverRequest equationRequest) {
        LOGGER.debug("Received request to create the {}", equationRequest);
        System.out.println("Received request to create the {}"+ equationRequest);
        try {
            equationSolveService.processEquation(equationRequest);
            return new ResponseEntity(equationSolveService.processEquation(equationRequest), HttpStatus.OK);
        }catch(Exception exp){
            return new ResponseEntity(equationRequest, HttpStatus.BAD_REQUEST);
        }
    }


}
