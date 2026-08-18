package ControlFlowStatement.Conditional;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        // Bank ATM

        double balance = 1000.00;
        double debit = 200.00;
        int pin = 124;

        if (pin == 1234) {
            if (debit < balance) {
                balance -= debit;
                System.out.println("Withdraw successful");
                System.out.println("Reamining Balance: " + balance);
            }
            else{
                System.out.println("Balance is not efficient");
            }
        }
        else {
            System.out.println("pin is wrong");
        }







        /*// Product delivery

        String location = "une";
        double amount = 1000;

        if(location.equals("Pune")){
            System.out.println("delivery available.....");
            if (amount > 2000){
                System.out.println("no delivery charges");
            }
            else {
                System.out.println("Delevery charge is $10");
            }
        }
        else{
            System.out.println("Delivary Not Available");
        }
*/






        /*     //admission in college
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your age:");
        int age = sc.nextInt();

        if (age > 18 && age < 25){
            System.out.println("You are Eligible for admission....");

            System.out.println("Enter your marks:");
            int mark = sc.nextInt();
            if (mark > 95){
                System.out.println("you eligible for scholarship");
            }
            else if (mark> 70 && mark < 96) {
                System.out.println("You have to pay 2 lack Donation for scholarship");
            }
            else if (mark > 40 && mark < 71){
                System.out.println("You have too pay 5 lakh for admission");
            }
            else{
                System.out.println("you not n condition");
            }

        }
        else{
            System.out.println("Not eligible for admission");
        }
*/



        /*if(10<20){
            System.out.println("Outer");
            if(20>30){
                System.out.println("Hello");
            }
            else{
                System.out.println("Bye");
            }
        }*/
    }
}
