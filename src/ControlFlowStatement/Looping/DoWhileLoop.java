package ControlFlowStatement.Looping;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

       // banking application
        int i = 1;
        int pin = 1234;
       Scanner sc = new Scanner(System.in);
       double balance = 10000.00;
       int userpin;
       int attempt = 3;
       int attemptseen = 3;

       do
       {
           System.out.println("Welcome Banking System...");
           System.out.println("1. Deposit");
           System.out.println("2. withdraw");
           System.out.println("3. check balance");
           System.out.println("4. Exit");

           System.out.println("Enter Your Choice: ");
           int Choice = sc.nextInt();

           if(Choice == 1)
           {
               System.out.print("Enter the Deposit amount:");
               double deposit = sc.nextDouble();
               if (deposit > 0)
               {
                   balance += deposit;
                   System.out.println("Deposit '" + deposit +"' Successful.... Garibi hatava....");
               }
               else
               {
                   System.out.println("Invalid deposit amount");
               }

           }
           else if (Choice == 2)
           {
               System.out.println("Enter pin:");
               userpin = sc.nextInt();
               if (pin == userpin)
               {
                   System.out.println("Enter the withdraw amount");
                   double withdraw = sc.nextDouble();
                   if(withdraw > 0)
                   {
                       if(balance >= withdraw)
                       {
                           balance -= withdraw;
                           System.out.println("Withdraw '"+ withdraw+"' Successful.... Garib vadhat ahe");
                       }
                       else
                       {
                           System.out.println("Inefficient balance, ye Garib....");
                       }
                   }
                   else
                   {
                       System.out.println("Invalid Withdraw amount");
                   }

               }
               else
               {
                   outer:
                   do
                   {
                       attempt--;
                       System.out.println("wrong pin, attempt left:" + attempt);

                       if (attempt > 0 && pin == userpin)
                       {
                           System.out.println("Enter the withdraw amount");
                           double withdraw = sc.nextDouble();
                           balance -= withdraw;
                           System.out.println("Withdraw Successful....Garib zalas");
                       }
                       else if (attempt == 0)
                       {
                           System.out.println("Your are Blocked. Contact Bank Manager");
                           System.exit(0);
                       }
                       else
                       {
                           System.out.println("try again");
                           break outer;
                       }

                   }
                   while (true);
               }


           }
           else if (Choice == 3)
           {
               System.out.println("Enter pin:");
               userpin = sc.nextInt();
               if (pin == userpin)
               {
                   System.out.println("Remaining balance:"  + balance);
               }
               else
               {
                   do
                   {
                       attemptseen--;
                       System.out.println("wrong pin, attempt left:" + attemptseen);

                       if (attemptseen > 0 && pin == userpin)
                       {

                           System.out.println("Remaining balance: " + balance);
                       }
                       else if (attemptseen == 0)
                       {
                           System.out.println("Your are Blocked. Contact Bank Manager");
                           System.exit(0);
                       }
                       else
                       {
                           System.out.println("try again");
                           break;
                       }

                   }
                   while (true);

               }
           }
           else if (Choice == 4)
           {
               System.out.println("Byeeeeeeeeeeee.........Garibbbbbbbbbbbb.............");
               break;
           }
           else
           {
               System.out.println("Enter Number between 1 to 4...bye");
           }
       }
       while (true);













        /* ATM application
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
        while(true);*/






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
