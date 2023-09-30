package com.xmlparsing.parsing.accolite;

import java.util.Arrays;

public class BudgetProgram {

    public static void main(String[] args) {
        double[] frontendRates = {10.0, 15.0, 12.0, 8.0}; // Example hourly rates for front-end developers
        double[] backendRates = {12.0, 14.0, 10.0, 9.0};  // Example hourly rates for back-end developers
        double budget = 28.0;

        double[] selectedFrontendDevelopers = new double[3];
        double[] selectedBackendDevelopers = new double[3];

        if (findDevelopers(frontendRates, backendRates, budget, selectedFrontendDevelopers, selectedBackendDevelopers)) {
            System.out.println("Selected Front-end Developers: " + Arrays.toString(selectedFrontendDevelopers));
            System.out.println("Selected Back-end Developers: " + Arrays.toString(selectedBackendDevelopers));
        } else {
            System.out.println("No combination found within the budget.");
        }
    }

    // Helper method to find the combination of developers within the budget
    public static boolean findDevelopers(double[] frontendRates, double[] backendRates, double budget,
                                         double[] selectedFrontendDevelopers, double[] selectedBackendDevelopers) {
        if (frontendRates.length < 3 || backendRates.length < 3) {
            return false; // Not enough developers to form a team
        }

        Arrays.sort(frontendRates);
        Arrays.sort(backendRates);

        for (int i = 0; i < 3; i++) {
            selectedFrontendDevelopers[i] = frontendRates[i];
            selectedBackendDevelopers[i] = backendRates[i];
        }

        double totalCost = Arrays.stream(selectedFrontendDevelopers).sum() + Arrays.stream(selectedBackendDevelopers).sum();

        return totalCost <= budget;
    }

}
