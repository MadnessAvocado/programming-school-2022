package example.equation.impl;

import example.equation.EquationSolver;
import example.equation.model.LinearEquationRequest;
import example.equation.model.LinearEquationResult;

public class LinearEquationSolver implements EquationSolver<LinearEquationResult, LinearEquationRequest> {
    @Override
    public LinearEquationResult solve(LinearEquationRequest request) {
        return new LinearEquationResult(request.b() / request.a());
    }
}
