package OOPS.Constructor;

public class Employee1
{
    Employee1()
    {
        this(10); //call to the constructor which taking one constructor
        System.out.println("Zero para");
    }
    Employee1(int i)
    {
        this(10,20); // call to the constructor which taking one costructor
        System.out.println("1 para");
    }

    Employee1(int i, int j)
    {
        System.out.println("2 para");
    }

    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        /*Employee1 e2 =new Employee1(10);
        Employee1 e3 = new Employee1(10,30);*/

    }
}
