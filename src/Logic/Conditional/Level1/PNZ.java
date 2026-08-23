package Logic.Conditional.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PNZ
{
    public static void main(String[] args) throws IOException
    {
      // Take a number and print whether it’s positive, negative, or zero.
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number");
        a = Integer.parseInt(br.readLine());


        if(a>0)
        {
            System.out.println("Number is Positive.");
        }
        else if (a < 0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("It is Zero");
        }
    }
}
