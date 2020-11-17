package KeyboardInput;
import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double height, BMI;
        int weight;

        System.out.print("This is the body mass index (BMI) calculator!\nWould you first tell me your height in m? ");
        height = keyboard.nextDouble();

        System.out.print("And what is your weight in kg? ");
        weight = keyboard.nextInt();

        BMI = Math.round((weight/(height*height))*10.0)/10.0;

        System.out.println("\nYour BMI is " + BMI + "\n" +
                "If your BMI is lower than 18,5: you're underweight\n" +
                "If your BMI is between 18,5 - 25.0: you have a healthy weight\n" +
                "If your BMI is 25 - 30: you are overweight\n" +
                "If your BMI is more than 30: you are obese");
}}
//    The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat
//    in populations.
//    It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their
//    height in meters.