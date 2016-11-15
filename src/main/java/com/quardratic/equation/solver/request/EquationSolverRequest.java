package com.quardratic.equation.solver.request;

import java.util.ArrayList;
import java.util.List;

public class EquationSolverRequest {

        List<Integer> coefficients = new ArrayList<>(4);

        public List<Integer> getCoefficients() {
            return coefficients;
        }

        public void setCoefficients(List<Integer> coefficients) {
            this.coefficients = coefficients;
        }


        private List<Integer> searchRange = new ArrayList<>(2);

        public List<Integer> getSearchRange() {
            return searchRange;
        }

        public void setSearchRange(List<Integer> searchRange) {
            this.searchRange = searchRange;
        }

        @Override
        public String toString() {
            return "EquationSolverRequest{" +
                    "coefficients=" + coefficients +
                    ", searchRange=" + searchRange +
                    '}';
        }
}
