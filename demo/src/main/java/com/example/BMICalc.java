package com.example;

public class BMICalc {

    public double calculateBMI(double height, double weight) {
        if (height <= 0 || weight <= 0) {
            return -1;
        }
        double bmi = weight / (height * height);
        return Math.round(bmi * 10.0) / 10.0;
    }

    public String getBMICategoryString(double height, double weight) {
        double bmi = calculateBMI(height, weight);
        if (bmi == -1) {
            return "Invalid input";
        }

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal weight";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}