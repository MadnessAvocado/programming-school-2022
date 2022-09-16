package example.equation;

import example.equation.impl.LinearEquationSolver;
import example.equation.model.LinearEquationRequest;
import example.equation.model.LinearEquationResult;

public class EquationMain {
    public static void main(String[] args) {
        System.out.println("*".repeat(10) + " Equation " + "*".repeat(10));

        System.out.println("Solving equation: 2x = 8");

        EquationSolver<LinearEquationResult, LinearEquationRequest> solver = new LinearEquationSolver();
        var solution = solver.solve(new LinearEquationRequest(1, 2));

        System.out.println("Got solution = " + solution);

        System.out.println();
    }
}
