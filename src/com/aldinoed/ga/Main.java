package com.aldinoed.ga;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String solution;

        System.out.print("Inputkan solusi: ");
        solution = scanner.nextLine();

        FitnessCalculator fitnessCalculator = new FitnessCalculator(solution);
        fitnessCalculator.printSolution();

//        System.out.println();
    }
}
