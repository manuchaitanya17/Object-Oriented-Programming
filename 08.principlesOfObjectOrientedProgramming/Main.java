//CHAPTER-9 PRINCIPLES OF OBJECT ORIENTED PROGRAMMING

//THEORY
//A. FOUR MAIN OBJECT ORIENTED PROGRAMMING CONCEPTS IN JAVA-RN


//B. INHERITANCE

//I. Why do we need Inheritance? - RN
//II. Important Terminologies Used in Java Inheritance - RN


//III. How to Use Inheritance in Java?

class Bicycle {
 
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public String toString(){
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}


class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gear, int speed,
                        int startHeight){

        super(gear, speed);
        seatHeight = startHeight;
    }

    
    public void setHeight(int newValue){
        seatHeight = newValue;
    }


    @Override public String toString(){
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}


//IV. Java Inheritance Types

//1. Single Inheritance

class One {
    public void print_geek(){
        System.out.println("Geeks");
    }
}


class Two extends One {
    public void print_for() { System.out.println("for"); }
}


//2. Multilevel Inheritance

class One {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

class Two extends One {
    public void print_for() {
        System.out.println("for");
    }
}

class Three extends Two {
    public void print_lastgeek() {
        System.out.println("Geeks");
    }
}

//3. Hierarchical Inheritance

class A {
    public void print_A() {
         System.out.println("Class A"); }
}

class B extends A {
    public void print_B() {
         System.out.println("Class B"); }
}

class C extends A {
    public void print_C() {
         System.out.println("Class C"); }
}

class D extends A {
    public void print_D() {
         System.out.println("Class D"); }
}


//4. Multiple Inheritance - In Interface Chapter, cannot be done using classes. Refer MultipleInheritance.png
//5. Hybrid Interface - RN



//V. "super Keyword"

class Box{
    int l;
    int b;
    int h;
    
    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Box(int l, int b, int h){
        super(); //Output: No Error, it's calling the constructor of Object Class.
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box other){
        this.h = other.h;
        this.b = other.b;
    }

}

class BoxW extends Box{
    int w;

    BoxW(){
        /* super(); After calling BoxW() Constructor it called super() internally
           which means it called the constructor with no parameter. */ 
        this.w = -1;
    }

    BoxW(int l, int b, int h, int w){
        super(l, b, h);
        super.h = 222; //Note: We have although used this.h but what if we have h property in both.
        this.w = w;
    }

    BoxW(BoxW other){
        super(other);
        this.w = other.w;
    }
}


//C. POLYMORPHISM
//I. Types of Polymorphism- RN

//II. Compile-Time Polymorphism

class Example1Type {

    static int Multiply(int a, int b){
        return a * b;
    }

    static double Multiply(double a, double b){
        return a * b;
    }
}

class Example2NumbersOfParameter {

    static int Multiply(int a, int b){
        return a * b;
    }


    static int Multiply(int a, int b, int c) {
        return a * b * c;
    }
}

class Example3ReturnType {

    static int Multiply(int a, int b){
        return a * b;
    }


    static double Multiply(int a, int b) {
        return (double)(a * b);
    }
}

class Example3TypeOrder {

    static void Multiply(String a, int b){
        System.out.println(a+b);
    }


    static void Multiply(int a, String b) {
        System.out.println(a+b);
    }
}


//III. Run-Time Polymorphism

class Parent {

    void Print() {
        System.out.println("parent class");
    }

    static void Play(){
        System.out.println("Play Parent");
    }
}

class subclass1 extends Parent {

    void Print() {
         System.out.println("subclass1");
    }
    
    static void Play(){
        System.out.println("Play Child");
    }
    //Note: Here no overriding will done.

}

class subclass2 extends Parent {

    void Print(){
        System.out.println("subclass2");
    }
}

//D. ENCAPSULATION
class Person {

    private String name;
    private int age;

    public String getName() {
         return name;
    }

    public void setName(String name) {
         this.name = name; 
    }

    public int getAge() { 
        return age; 
    }

    public void setAge(int age) {
         this.age = age; 
    }
}

//E. ABSTRACTION-RN




public class Main {

    public static void main(String[] args) {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());


        BoxW box1 = new BoxW();
        System.out.println(box1.l + " " + box1.w);


        BoxW box2 = new BoxW(1,2,3,4);
        System.out.println(box1.l + " " + box1.w);


        Box box3 = new BoxW(1,2,3,4);
        /* Note: Internally a BoxW Object gets created in the heap, then it
           initialised the Box Variables with the given values, but not the
           BoxW Variables or included it in the Box3 Object. */

        System.out.println(box3.w); //Output: Error


        BoxW box4 = new Box(1,2,3); //Output: Error, 
        // Note: It cannot create an object of type parent but referncing the child.

        
        subclass1 obj1 = new subclass1();
        obj1.Print();  //Output: subclass1


        Parent obj2 = new subclass1();
        obj2.Print();  //Output: subclass1 
        /* Note: But according to JVM it should have run Parent. This is what
           Method Overriding is. Which method will be called depends upon the Object Type. 
           not the Data Type. Which one will be accessed will depnend upon the Reference
           Type/Data Type. This is called Upcasting. */

        /* Note: Here in this program, When an object of a child class is created, 
           then the method inside the child class is called. This is because The 
           method in the parent class is overridden by the child class. Since The
           method is overridden, This method has more priority than the parent method 
           inside the child class. So, the body inside the child class is executed. */


        obj2.Play(); //Output: Play Parent.


    }
}
