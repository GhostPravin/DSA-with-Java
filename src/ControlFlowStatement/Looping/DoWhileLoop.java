package ControlFlowStatement.Looping;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        // ATM application
        // Take the pin from user 3 time and check it .. if pin entered  wrong 3 time.. block account
        Scanner sc = new Scanner(System.in);
        int pin = 1212;
        int attemps = 3;
        outer:
        do
        {
            System.out.print("Enter your pin:");
            do
            {
                int userpin = sc.nextInt();
                if(pin == userpin)
                {
                    System.out.println("Welcome to java ATM app");
                    break outer;
                }
                else
                {
                    attemps--;
                    System.out.println("Incorrect "+ attemps + " left");
                    if (attemps == 0)
                    {
                        System.out.println("account blocked");
                        break outer;
                    }
                    System.out.print("Enter pin Again:");
                }

            }
            while (true);
        }
        while(true);






       /* int i =1;
        do
        {
            int j = 2;
            do
            {
                System.out.print(i * j + "\t");
                j++;
            }
            while (j<=30);

            System.out.println();
            i++;
        }
        while (i<=10);*/


        /*int i = 1;
        do
        {
            System.out.print("Ram ");
            i++;

            int j=1;
            do
            {
                System.out.println("Shyam");
                j++;
            }
            while(j<=10);
        }
        while (i<=10);*/



    }
}
