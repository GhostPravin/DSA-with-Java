package OOPS.Constructor;
//user info
public class Constructor {
    String username;
    String password;
    String email;



    void setUsername(String u, String p, String e)
    {
        username = u;
        password = p;
        email = e;
    }

    void display()
    {
        System.out.println(username);
        System.out.println(password);
        System.out.println(email);
    }


    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        c1.setUsername("Ram", "1233", "pravin@gamail.com");
//        Constructor c2 = new Constructor();
        c1.display();
        System.out.println("====================================================");

        Constructor c2 = new Constructor();
        c2.setUsername("Sham","1234","pravinpawar2114@gmail.com");
        c2.display();
    }

}
