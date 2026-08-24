package OOPS;

public class Method {
    //method without return type and parameter
    void add()
    {
        System.out.println(10 + 12);
    }

    //method with parameter and without return type
    void add(int a, int b)
    {
        System.out.println(a + b);
    }



    //method without parameter and with return type
    String fun()
    {
        return "Hello";
    }
    //with parameter and return type
    int sub(int a, int b, int c)
    {
        return a-b-c;
    }

    public static void main(String[] args) {
        Method m1 = new Method();
        System.out.println("Add Method:");
        m1.add();

        m1.add(10, 20);

        String x = m1.fun();
        System.out.println(x);

        int y = m1.sub(200, -32,23);
        System.out.println(y);

    }



}
