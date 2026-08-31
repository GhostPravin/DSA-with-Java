package Phase1_Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSign {
    public static void main(String[] args) throws IOException {
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Emter a Number: ");
        a = Integer.parseInt(br.readLine());

        if (a == 0)
        {
            System.out.println("Numer is Zero");
        }
        else if (a < 0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is positive");
        }

    }
}
