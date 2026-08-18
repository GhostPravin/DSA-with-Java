package ControlFlowStatement.Looping;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {


        // infinite loop
        /*int i = 1;
        for ( ; i<10;)
        {
            System.out.println("Ram");
            i++;
        }*/

        /*int i = 1;
        for ( ; i<10; i ++)
        {
            System.out.println("Ram");
        }*/


        /*for (int i = 1; i<10;)
        {
            System.out.println("Ram");
        }*/


        /* for (int i =1;;)
        {
            System.out.println("Ram");
        }
*/

        /*for (;;)
        {
            System.out.println("Ram");
        }*/




        // Star patterns
        /*//square
        for (int i = 0; i <5; i++){
            for (int j = 0; j<5; j++)
            {
                if (i == 3)
                {
                    System.out.print("# ");
                }
                else if (j == 2)
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print(i + " ");
                }

            }
            System.out.println(" ");

        }*/








      /*  //Row and column
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j<=3; j++){
                System.out.print("Ram ");
            }
            System.out.println("");
        }*/








        /* // table from 2 to 30 using nested for

        for (int i = 1; i <= 10; i++){

            for (int j = 2; j<=30; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }*/






        /*//table
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(i*num);
        }
*/





        /* for (int i = 0, j = 0, k = 0; i <=10; i++, j++, k++) {
            System.out.println(i+ "  " + j + " " + k);
        }*/



        /*for (int i =1,j ='A'; i<=10; i++, j++){
             System.out.println((char)j);
         }*/
    }
}
