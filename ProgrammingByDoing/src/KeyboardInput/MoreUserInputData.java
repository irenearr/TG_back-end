package KeyboardInput;
import java.util.Scanner;

public class MoreUserInputData {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String firstname, lastname, login;
        int grade, studentID;
        double GPA;

        System.out.print("Please enter the following information so I can sell it for a profit!\nFirst name ");
        firstname = keyboard.next();
        System.out.print("Last name ");
        lastname = keyboard.next();
        System.out.print("Grade (9-12) ");
        grade = keyboard.nextInt();
        System.out.print("Student ID ");
        studentID = keyboard.nextInt();
        System.out.print("Login ");
        login = keyboard.next();
        System.out.print("GPA (0.0-4.0) ");
        GPA = keyboard.nextDouble();
        System.out.println("\nYour information:\n" +
                "     Login: " + login + "\n" +
                "     ID:    " + studentID + "\n" +
                "     Name:  " + lastname + ", " + firstname + "\n" +
                "     GPA:   " + GPA + "\n" +
                "     Grade: " + grade
        );
    }
}

//        Your information:
//        Login: bonham_453916
//        ID:    453916
//        Name:  Bonham-Carter, Helena
//        GPA:   3.73
//        Grade: 12