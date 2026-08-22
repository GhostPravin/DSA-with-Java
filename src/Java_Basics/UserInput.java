package Java_Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(br.readLine());

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);




        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Age: ");
        String s1 = br.readLine();
        int age = Integer.parseInt(s1);
        System.out.println("My age is: " + age);

        System.out.println("Enter rollno.: ");
        int roll = Integer.parseInt(br.readLine());

        System.out.println("My Roll No. : " + roll);*/
    }
}
