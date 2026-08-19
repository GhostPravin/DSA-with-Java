package ControlFlowStatement.Looping;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select your Gender");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Other");

        int gebderchoice = sc.nextInt();
        String gender = "";

        switch (gebderchoice)
        {
            case 1:
            {
                gender = "Male";
                break;
            }
            case 2:
                gender = "Female";
                break;

            case 3:
                gender = "Other";

            default:
                System.out.println("invalid choice");
        }

        System.out.println("/n Select your Education:");
        System.out.println("1. SCC");
        System.out.println("2. HSC");
        System.out.println("3. UG");
        System.out.println("4. PG");

        int educhoice = sc.nextInt();

        String education = "";
        switch(educhoice)
        {
            case 1:
                education = "SSC";
                break;
            case 2:
                education = "HSC";
                break;
            case 3:
                education = "UG";
                break;
            case 4:
                education = "PG";
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("Gender is: "+ gender);
        System.out.println("Highest Education: "+ education);












       /* //calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n1 = sc.nextInt();

        System.out.println("Enter Second Number");
        int n2 =sc.nextInt();

        System.out.println("Enter the Operator(+, -, *, /, %");
        char choice = sc.next().charAt(0);

        switch (choice)
        {
            case '+':
                System.out.println("Addition : " + (n1 + n2));
                break;

            case '-':
                System.out.println("Substraction : " + (n1 - n2));
                break;
            case '*':
                System.out.println("Multiplication : " + n1*n2);
                break;

            case '/':
                System.out.println("Division: " + n1 / n2);
                break;

            case '%':
                System.out.println("Modulus:" + n1 % n2);
                break;

            default:
                System.out.println("Invalid Input");
        }*/







        /*switch(1 + 2)
        {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("jevala ka");
                break;

            case 3:
                System.out.println(" bolllll");
                break;

            case 4:
                System.out.println("bye");
                break;

            default:
                System.out.println("Good bye hmmmmm");
        }*/
    }
}
