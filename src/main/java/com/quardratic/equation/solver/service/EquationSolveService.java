package com.quardratic.equation.solver.service;

import com.quardratic.equation.solver.request.EquationSolverRequest;

import java.util.Map;

public interface EquationSolveService {

    Map<String, Integer> processEquation(EquationSolverRequest equationSolverRequest);
}
