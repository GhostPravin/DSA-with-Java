package OOPS.Constructor;

public class Employee {

    //default constructor
    //compiler will create default constructor if there is no construct
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        //display();
    }
    Employee(Employee e)
    {
        this.id = e.id;
        this.name = e.name;
        this.salary = e.salary;
    }

    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main(String[] args) {

//e1=====copy to ====== e2
        Employee e1 = new Employee(01, "Pravin", 10000.00);
        e1.display();
        System.out.println("===============================================================");

        Employee e2 = new Employee(e1);
        //copy constructor
        //e2 = e1;
        e2.display();


    }
}
