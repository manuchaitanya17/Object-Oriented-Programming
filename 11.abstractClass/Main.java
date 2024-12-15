//CHAPTER-12 ABSTRACT CLASS AND INTERFACES

//A. INTRODUCTION TO  ABSTRACT CLASS-RN

//I. Example-1
abstract class Sunstar {
    abstract void printInfo();
}

class Employee extends Sunstar {
    void printInfo(){
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}


//II. Example-2
abstract class Subject {
    Subject() { 
      System.out.println("Learning Subject"); 
    }
  
      abstract void syllabus();
  
      void Learn(){
          System.out.println("Preparing Right Now!");
    }
}

class IT extends Subject {
  void syllabus(){
    System.out.println("C , Java , C++");
  }
}


//B. PROPERTIES OF ABSTRACT CLASS
//I. Observation-1
abstract class Base0 {
    abstract void fun();
}

class Derived0 extends Base0 {
    void fun(){
        System.out.println("Derived fun() called");
    }
}


//II. Observation-2
abstract class Base1 {

    Base1(){
        System.out.println("Base Constructor Called");
    }

    abstract void fun();
}

class Derived1 extends Base1 {
    Derived1(){
        System.out.println("Derived Constructor Called");
    }

    void fun(){
        System.out.println("Derived fun() called");
    }
}


//III. Observation-3
abstract class Base2 {
    void fun(){
        System.out.println(
            "Function of Base class is called");
    }
}

class Derived2 extends Base2 {
    // This class only inherits the Base class methods and properties.
}


//IV. Observation-4
abstract class Base3 {

    final void fun(){
        System.out.println("Base fun() called");
    }
}

class Derived3 extends Base3 {
  
}


//V. Observation-5-RN
//VI. Observation-6-RN

//VII. Observation-7
abstract class B {
    abstract class C {
        abstract void myAbstractMethod();
    }
}

class D extends B {
    class E extends C {
        void myAbstractMethod(){
            System.out.println("Inside abstract method implementation");
        }
    }
}


//Observation-8 
abstract class Demo {
    abstract void m1();
}

class Child extends Demo {
    public void m1(){ 
      System.out.print("Hello"); 
    }
}


//Observation-9
abstract class Demo {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class FirstChild extends Demo {
    public void m1() {
      System.out.println("Inside m1"); 
    }
}

class SecondChild extends FirstChild {
    public void m2() {
      System.out.println("Inside m2"); 
    }
    public void m3() {
      System.out.println("Inside m3");
    }
}


public class Main {
    public static void main(String[] args) {
        Sunstar s = new Employee();
        s.printInfo();


        Subject x = new IT();
        x.syllabus();
        x.Learn();


        Base0 b = new Derived0();
        b.fun();


        Derived1 d = new Derived1();
        d.fun();



         Derived2 d = new Derived2();
         d.fun();


         Base3 b = new Derived3();
         b.fun();


         D outer = new D();
         D.E inner = outer.new E();
         inner.myAbstractMethod();


         Child c = new Child();
         c.m1();


         // FirstChild f=new FirstChild();
         // f.m1();
         SecondChild s = new SecondChild();
         s.m1();
         s.m2();
         s.m3();



    }
}
