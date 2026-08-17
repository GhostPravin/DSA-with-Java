package ControlFlowStatement.Conditional;

import java.sql.SQLOutput;

public class ElseIF {
    public static void main(String[] args) {
        String user = "Rm";
        String pass = "Add1233";

        if(user == "Ram" && pass == "Add123"){
            System.out.println("Login Successful");
        }
        else if (!(user.equals("Ram")) && pass.equals("Add123")){
            System.out.println("User incorrect");
        }
        else if (!(pass.equals("Add123")) && user.equals("Ram")){
            System.out.println("Password incorrect");
        }
        else{
            System.out.println("user and pass incorrect");
        }


        /*int n = 12;
        if (n > 0){
            System.out.println("Positive Number '"+ n +"'");
        }
        else if (n < 0) {
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }*/
    }
}
