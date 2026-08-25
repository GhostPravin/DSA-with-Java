package OOPS.Constructor;

public class User {
    String userName;
    String password;
    String email;

    User()
    {
        System.out.println("GHOST");
    }

    void setUser(String u,String p, String e)
    {
        userName = u;
        password = p;
        email = e;

    }

    void display()
    {
        System.out.println(userName);
        System.out.println(password);
        System.out.println(email);

    }



    public static void main(String[] args) {
        User u1 = new User();

        u1.setUser("Pravin Pawar", "123PP", "pravinpawar2114@gmail.com");
        u1.display();




    }
}
