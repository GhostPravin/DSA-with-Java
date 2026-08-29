package OOPS.Constructor_method_diff;

public class User {


    //constructor
    User()
    {
        System.out.println("0 Program");

    }


    //Method
    void fun()
    {
        System.out.println("fun");
    }
    public static void main(String[] args) {

        User user = new User();
        //User user = new User();
        user.fun();
        user.fun();
    }
}
