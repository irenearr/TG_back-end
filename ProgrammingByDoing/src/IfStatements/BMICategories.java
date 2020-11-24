package IfStatements;

import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double height, BMI;
        int weight;

        System.out.print("This is the body mass index (BMI) calculator!\nWould you first tell me your height in m? ");
        height = keyboard.nextDouble();

        System.out.print("And what is your weight in kg? ");
        weight = keyboard.nextInt();

        BMI = Math.round((weight/(height*height))*10.0)/10.0;

        System.out.println("\nYour BMI is " + BMI + ".");
        if (BMI < 18.5) {
            System.out.println("You're underweight.");
        }
        if (BMI > 18.5 && BMI < 25) {
            System.out.println("You have a healthy weight.");
        }
        if (BMI > 25 && BMI < 30) {
            System.out.println("You are overweight.");
        }
        if (BMI > 30) {
            System.out.println("You are obese.");
        }
    }}
//    The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat
//    in populations.
//    It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their
//    height in meters.