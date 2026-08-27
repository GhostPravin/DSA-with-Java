package OOPS.Constructor;

public class Employee1
{
    Employee1()
    {
        System.out.println("Zero para");
    }
    Employee1(int i)
    {
        System.out.println("1 para");
    }

    Employee1(int i, int j)
    {
        System.out.println("2 para");
    }

    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        Employee1 e2 =new Employee1(10);
        Employee1 e3 = new Employee1(10,30);

    }
}
