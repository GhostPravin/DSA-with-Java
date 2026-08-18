package ControlFlowStatement.Looping;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        while (num < 0)
        {
            System.out.println("Enter any Number:");
            num = sc.nextInt();

            if (num > 0)
            {
                System.out.println("Good It is +ve");
            }
            else
            {
                System.out.println("Enter Positive number only");
            }
        }

    }
}
