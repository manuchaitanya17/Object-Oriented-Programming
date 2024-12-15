//CHAPTER-4- CONSTRUCTOR

//THEORY
//A. CONSTRUCTOR- INTRODUCTION



//B. TYPES OF CONSTRUCTOR
//I. DEFAULT CONSTRUCTOR
class DefaultConstructor {
  int a;
  int b;
  DefaultConstructor(){
     System.out.println("Default constructor"); 
  }
}

//II. PARAMETERISED CONSTRUCTOR
class ParameterisedConstructor {
  String name;
  int id;
  ParameterisedConstructor(String name, int id)
  {
      this.name = name;
      this.id = id;
  }
}

//III. COPY CONSTRUCTOR
class CopyConstructor {
  String name;
  int id;
  CopyConstructor(String name, int id)
  {
      this.name = name;
      this.id = id;
  }

  CopyConstructor(Geek obj2)
  {
      this.name = obj2.name;
      this.id = obj2.id;
  }
}



//C. CONSTRUCTOR OVERLOADING
class ConstructorOverloading {
  String name;
  int age;
  ConstructorOverloading(String name){
      System.out.println("Constructor with one "
                         + "argument - String : " + name);
  }

  ConstructorOverloading(String name, int age){

      System.out.println(
          "Constructor with two arguments : "
          + " String and Integer : " + name + " " + age);
  }

  ConstructorOverloading(int id){
      System.out.println(
          "Constructor with one argument : "
          + "INT : " + id);
  }
}


//D. DIFFERENCE BETWEEN CONSTRUCTOR AND METHOD-RN



//E. this KEYWORD
class ThisKeyword {
  String name;
  int age;

  //1. ‘this’ keyword to refer to current Class Instance Variables:
  ThisKeyword(String name){
    this.name = name;
  }


  ThisKeyword(String name, int age){
       this.name = name;
       this.age = age;
       //Note: Differentiate between the Local and Instance Variables.
  }
  

  //2. this() to invoke the current Class Constructor:
  ThisKeyword(){
    this("Default Name", 18);
   
  }


  //3. ‘this’ keyword to return the current Class Instance:
  ThisKeyword get(){
    return this;
  }


  //4. ‘this’ keyword as the Method Parameter: 
  void display(ThisKeyword obj){
    System.out.println(obj.name);
  }

  void getObject(){
    display(this);
  }


  //5. ‘this’ keyword to invoke the current Class Method:
  void displayMethod()
    {
        // calling function show()
        this.show();
 
        System.out.println("Inside display function");
    }
 
  void show(){
        System.out.println("Inside show function");
  }
}


//6. ‘this’ keyword as an argument in the Constructor Call:
class A {
    B obj;
 
    A(B obj)
    {
        this.obj = obj;
        obj.display();
    }
}
 
class B {
    int x = 5;

    B() {
       A obj = new A(this);
    }
    
    void display()
    {
        System.out.println("Value of x in Class B : " + x);
    }
    
}



class Main {
    public static void main(String[] args){
      DefaultConstructor object1 = new DefaultConstructor();
      ParameterisedConstructor object2 = new ParameterisedConstructor("Manu Chaitanya", 23);
      CopyConstructor object3 = new CopyConstructor("Vaishnavi Jaiswal", 22);
      CopyConstructor object4 = new CopyConstructor(object3);
      ConstructorOverloading object5 = new ConstructorOverloading(0);
      ConstructorOverloading object6 = new ConstructorOverloading("Anshul Chaurasiya", 24);
      thisKeyword object7 = new thisKeyword();

    }
}