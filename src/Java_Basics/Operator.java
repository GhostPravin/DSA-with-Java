package Java_Basics;

import javax.swing.*;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args)
    {
        //6) Ternary Operator
        /* Syntax :
        datatype variableName = (condition) ? 1st expression : 2nd expression;
            if condition = true --> 1st expression execute
            else 2n will execute
            expressions datatype should be same
         */
        /*String result = (110<20) ? "Mi lahan ahe" : "Mi motha nahi";
        System.out.println(result);*/

        //example
        /*System.out.println("Enter age:");
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        String Eligible = (age > 18) ? "Eligible" : "Not Eligible";
        System.out.println(Eligible);*/

        //example
       /* double salary = 10000;
        double result = (salary>=10000)? (salary+=1000) : (salary+=500);
        System.out.println(result);*/



        //5)Unary Operator
         //1) + & - ==> -
         //2) - & - ==> -
         //3) - & - ==> +
         //4) + & + ==> +
      /*  int a = 100, b = 300, c = 200;
        int r = ++a + --b - ++c;
        System.out.println(r);*/
      /*  System.out.println(a++); //100
        System.out.println(a);   //101*/


/*
        int a, b;
        System.out.println("Enter 2 Numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
*/
        //Assignment Operator(=, +=, -=, *=, /=, %=)
       /* int x = 100;
        x = x + 10;     //=
        x += 10;        // +=
        System.out.println(x);*/

        //example of assignment operator
       /* int balance = 50000;
        int deposite;
        System.out.println("Enter the deposite: ");
        Scanner sc = new Scanner(System.in);
        deposite = sc.nextInt();

        balance += deposite;
        System.out.println("Balance: "+ balance);

        int withdraw;
        System.out.println("Enter the withdraw: ");
        withdraw = sc.nextInt();

        balance -= withdraw;
        System.out.println("Withdraw balance : " + balance);*/

        //Logical Operator (&&, ||, !)
       /* System.out.println("And Operator(&&): " + (a <= b && b >= a));
        System.out.println("OR Operator(||) : " + (a <= b || b > a));*/

        //login
      /*  String username = "Ghost";
        int pasword = 1234;
        boolean isAuth = false;

        System.out.println(username == "Ghost" && pasword == 1234 && !isAuth);*/

        //Relational Operator(<, >, <=, >=, ==, != )
/*        System.out.println("Greater:" + (a>b));
        System.out.println("Smaller : " + (a<b));*/


        //Arithmetic operator
       /* System.out.println("addition:" + (a + b));
        System.out.println("Sub:" + (a - b));
        System.out.println("Multi:" + (a * b));
        System.out.println("Div:" + (a / b));*/

    }



}
