class LocalVariable {

    public void fun(){
        int var = 10;
        System.out.println("Local Variable: " + var);
    }

}


class InstanceVariable {

    public String name;
    public int i;
    public Integer I;

    public InstanceVariable(){
        this.name = "Manu Chaitanya";
    }
}


class StaticVariable { 

    int id; 
    String name; 
    int salary; 

    static String ceo; 
    // Note: Here we are declaring CEO as a static variable 

    static a = 4;
    static b;
  
    
    StaticVariable(int id, String name, int salary, String ceo){ 
        this.id = id; 
        this.name = name; 
        this.salary = salary; 
        this.ceo = ceo; 
        //Note: Better to the Class Name StaticVariable.ceo. It's the Convention.
    } 
  
    public void display() { 
                System.out.println("ID: " + id + ", "
                           + "Name:: " + name + ", "
                           + "Salary: $" + salary + " & "
                           + "CEO:: " + ceo); 
    } 


    static void meth(){
        // display();
        /* Note: This will give an error, if I call it. Non-Static Context cannot 
           without creating objects. */

        StaticVariable object = new StaticVariable(1, "Manu", 1200, "Kritika");
        object.display();
        //Note: Now it's fine.

        // System.out.println(this.id);
        //Note: This will give an error.
    }

    
    {
        System.out.println("Static Block Run First!");
        b = a * 4;
    }
} 


public class Main {

    public static void main(String[] args) {

        System.out.println("Main Function Executed!");

        int a = 2; 
        //Note: This is a Local Variable.

        StaticVariable Monodwip = new emp(1, "Monodwip", 30000, "Rinkel"); 
        StaticVariable Mukta = new emp(2, "Mukta", 50000, "Rinkel"); 
        StaticVariable Subham = new emp(3, "Subham", 40000, "Arnab"); 
  
        Monodwip.display(); 
        Mukta.display(); 
        Subham.display(); 

        System.out.println(StaticVariable.a + " " + StaticVariable.b);
        
    }
}
