package OOPS.Constructor;

public class User {
    String userName;
    String password;
    String email;
// Non-Parameterized constructor/ default
    User()
    {
        System.out.println("GHOST");
    }

    //Parameterized Constructor

    User(String userName, String password, String email)
    {
        this.userName = userName;
        this.password = password;
        this.email = email;
        System.out.println("Para");
        //display();
    }

   /* void setUser(String u,String p, String e)
    {
        userName = u;
        password = p;
        email = e;

    }*/

    void display()
    {
        System.out.println(userName);
        System.out.println(password);
        System.out.println(email);

    }
    void show()
    {
        System.out.println(userName);
        System.out.println(password);
        System.out.println(email);
    }



    public static void main(String[] args) {
        // normal Object
        User u1 = new User("ram", "12334", "pravin@gmail.com");

        // Anonymos Object = The object which don't have any name
        new User("Ram", "123", "ram@gmail.com");;
        //u1.setUser("Pravin Pawar", "123PP", "pravinpawar2114@gmail.com");

        //also we can call only one method directly using ananymos object
        new User("Sham", "123","shyam@gmail.com").show();;





    }
}
