package com.example;

public class BMICalc {

    protected double height;
    protected double weight;

    public BMICalc() {
        this.height = 0;
        this.weight = 0;
        System.out.println("BMI Calculator ready!");
    }

    public double calculateBMI(double height, double weight) {
        if (height <= 0 || weight <= 0) {
            System.out.println("Invalid input values!");
            return -1.0;
        }
        double bmi = weight / (height * height);
        double rounded = Math.round(bmi * 10.0) / 10.0;
        System.out.println("Calculated BMI: " + rounded);
        return rounded;
    }

    public String getBMICategoryString(double height, double weight) {
        double bmi = calculateBMI(height, weight);

        if (bmi == -1.0) {
            return "Invalid";
        }

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
            return "Underweight";
        } else if (bmi < 25.0) {
            System.out.println("Category: Normal weight");
            return "Normal weight";
        } else if (bmi < 30.0) {
            System.out.println("Category: Overweight");
            return "Overweight";
        } else {
            System.out.println("Category: Obese");
            return "Obese";
        }
    }
}