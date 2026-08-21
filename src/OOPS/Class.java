package OOPS;

import java.security.PublicKey;
import java.util.Scanner;

public class Class {

    //Variable

    int id;
    String name;
    String address;
    String mobileNo;
    int age;

    public static void main(String[] args) {
         Class pravin = new Class();
         System.out.println("Enter Pravin Data:");
         Scanner sc = new Scanner(System.in);

         System.out.println("enter Id: ");
         pravin.id = sc.nextInt();
         sc.nextLine();

         System.out.println("Enter Name:");
         pravin.name = sc.nextLine();

         System.out.println("enter age:");
         pravin.age = sc.nextInt();
         sc.nextLine();

         System.out.println("Enter Mobbile");
         pravin.mobileNo = sc.nextLine();

         System.out.println("Address:");
         pravin.address = sc.nextLine();

         System.out.println("Pravin Data:");
         System.out.println("ID : " +pravin.id);
         System.out.println("Roll N0.: " + pravin.name);
         System.out.println("Age: " +pravin.age);
         System.out.println("Mob.: " + pravin.mobileNo);
         System.out.println("Address: " + pravin.address + "\n");


         Scanner sc1 = new Scanner(System.in);
         System.out.println("Enter Tushar Data;");


         Class tushar = new Class();

         System.out.println("enter Id: ");
         tushar.id = sc1.nextInt();
         sc.nextLine();

        System.out.println("Name:");
         tushar.name = sc1.nextLine();

        System.out.println("Age:");
         tushar.age = sc1.nextInt();
         sc.nextLine();

        System.out.println("MobileNo.: ");
         tushar.mobileNo = sc1.nextLine();

        System.out.println("Address:");
         tushar.address = sc1.nextLine();

         System.out.println("Tushar Data:");
         System.out.println("ID : "+ tushar.id);
         System.out.println("Name : "+ tushar.name);
         System.out.println("Age : "+ tushar.age);
         System.out.println("mobile :"+ tushar.mobileNo);
         System.out.println("Address: "+ tushar.address);

    }


}
