package com.quardratic.equation.solver.service;

import com.quardratic.equation.solver.request.EquationSolverRequest;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ramma on 0015,11/15/2016.
 */
@Service
public class EquationSolveServiceImpl implements EquationSolveService{
    private static final Logger LOGGER = LoggerFactory.getLogger(EquationSolveServiceImpl.class);

    @Override
    public Map<String, Integer> processEquation(final EquationSolverRequest equationSolverRequest) {
        LOGGER.debug(" Proesss Equation "+equationSolverRequest.getCoefficients());
        LOGGER.debug(" Proesss Equation "+equationSolverRequest.getSearchRange());
        Map<String, Integer> returnMap = new HashMap<>();
        returnMap.put("ROOT", new Integer(30));
        return returnMap;
    }

    private int rootFinder(){
        return 0;
    }



}
