package ControlFlowStatement.Conditional;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Enter UserName:");
        Scanner sc = new Scanner(System.in);
        String UserName = sc.nextLine();
        System.out.println("Enter Password:");
        String password = sc.nextLine();


        if (UserName.equals("Ram") && password.equals("admin123")){
            System.out.println("Login successful");
        }
        else {
            System.out.println("Login Failed");
        }


    }
}
