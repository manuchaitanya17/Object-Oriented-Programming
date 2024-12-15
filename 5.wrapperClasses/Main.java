//CHAPTER-5 WRAPPER CLASSES

//THEORY
//A. WRAPPER CLASS- INTRODUCTION
//B. NEED OF WRAPPER CLASS
//C. PRIMITIVE DATA TYPES AND CORRESPONING WRAPPER CLASS

class Main {
  public static void main(String[] args){
     Integer a = new Integer(55);

     Integer b = new Integer(); 
     //Note: Integer must be initialised else error.


     //D. AUTOBOXING AND UNBOXING
     Integer c = 55; 
     //Note: Here Primitive to Integer Object Conversion.
  
     ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
     arrayList1.add(25);
     //Note: ArrayList stores only Objects, so Autoboxing.


     ArrayList<Integer> arrayList2= new ArrayList<Integer>();
     arrayList2.add(24);

     int d = arrayList2.get(0);
     //Note: Unboxing because get method returns an Integer Object.


     //E. CUSTOM WRAPPER CLASS
     class Maximum {
        private int maxi = 0;
        private int size = 0;
    
        public void insert(int x){
            this.size++;
            if (x <= this.maxi){
                return;
            }
            this.maxi = x;
        }
    
        public int top() {
          return this.maxi;
        }
    
        public int elementNumber() {
          return this.size; 
        }

     };

  }
}



//F. 'final' KEYWORD
class FinalExample{
  
    //I. Initialisation of Variables Using ‘final’
    //Example-1
    final int THRESHOLD = 5;


    //Example-2
    final int MAXI;
    MAXI = 3;
    //Note: In Java we can do this not in C++.


    //Example-3
    int arr[] = { 1, 2, 3 };
    for (final int i : arr)
            System.out.print(i + " ");
    //Note: Here there is no error.
    

    //Example-4 A Blank 'final' Variable
    final int CAPACITY;

    // IIB for Initializing CAPACITY
    {
      CAPACITY = 25;
    }
    

    //Example-5 A Blank 'final' Variable
    final int  MINIMUM;
    
    //Constructor for Initializing MINIMUM
    public GFG() {
        MINIMUM = -1;
    }
    /* Note: If there are more than one constructor, we must initialize MINIMUM 
       in them also. */
        

    //Example-6 A Blank 'final' Variable
    static final double EULERCONSTANT;
    
    //SIB for Initializing EULERCONSTANT
    static{
        EULERCONSTANT = 2.3;
    }
}


//II. REFERENCE 'final' VARIABLE
class RFV {
    public static void main(String[] args){
      final StringBuilder sb = new StringBuilder("Geeks");

      sb.append("ForGeeks");
      /* Note: Changing Internal State of Object Reference by final Reference
         Variable sb will cause no Error. */
  }
}
