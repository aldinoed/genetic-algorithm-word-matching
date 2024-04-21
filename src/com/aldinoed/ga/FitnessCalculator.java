package com.aldinoed.ga;

public class FitnessCalculator {
    char[] solution;
    FitnessCalculator(String solutionInput){
        this.solution = solutionInput.toCharArray();
    }


//  Testing purpose only
    void printSolution(){
        for (char character : this.solution){
            System.out.println(character);
        }
    }
}
