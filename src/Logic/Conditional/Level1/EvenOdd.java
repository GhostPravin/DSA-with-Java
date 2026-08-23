package Logic.Conditional.Level1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //Check if a number is even or odd.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();

        if (a % 2 == 0)
        {
            System.out.println(a + " is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }

    }
}
