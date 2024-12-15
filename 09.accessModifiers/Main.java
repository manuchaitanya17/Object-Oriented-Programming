//CHAPTER-10 ACCESS MODIFIERS

//A. WHAT ARE ACCESS MODIFIERS-RN
//B. TYPES OF ACCESS MODIFIERS


//I. Default Access Modifiers
class DefaultAccessModifiers { 
    void display() { 
        System.out.println("Hello World!"); 
    } 
}


//II. Private Access Modifiers
class PrivateAccessModifiers {
    private void display(){
        System.out.println("Manu Chaitanya");
    }
}


class OuterClass {
    private class InnerClass {
        void display() {
            System.out.println("This is a private inner class.");
        }
    }

    void createInnerClass() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}
/* Note: InnerClass is a private nested class. It is only accessible within
   OuterClass and cannot be used outside it. */


class Parent {
    private void privateMethod() {
        System.out.println("Private method in Parent");
    }
}

class Child extends Parent {
    public void callPrivateMethod() {
        // privateMethod();  // CTE: privateMethod() has private access.
    }
}


public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class Person {
    private String name;  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
}


//III. Protected Access Modifiers-RN


//IV. Public Access Modifiers
public class PublicAccessModifiers { 
    public void display() { 
            System.out.println("Kritika Ranjan"); 
        } 
}



public class Main {

    public static void main(String[] args) {
        DefaultAccessModifiers obj1 = new DefaultAccessModifiers();
        obj1.display(); //Manu Chaitanya
        /* Note: Here when we accessed the class DefaultAccessModifiers from different 
           class but within the same package, hence no CTE. */


        PrivateAccessModifiers obj2 = new PrivateAccessModifiers();
        obj2.display(); //CTE, As the object is not going to be accessed in other class.


        PublicAccessModifiers obj4 = new PublicAccessModifiers();
        obj4.display(); //Output: Kritika Ranjan
    }
}
