// CHAPTER-13 EXCEPTION HANDLING

//A. INTRODUCTION TO EXCEPTION-RN
//B. DIFFERENCE BETWEEN EXCEPTION AND ERRORS-RN
//C. EXCEPTION HIRERACHY-RN


public class Main {
    
    public static void main(String[] args) {

    //D. TYPES OF EXCEPTIONS
        //I. Built-In Exception-RN
        
        //II. User-Defined Exception
        try{
            String name = "Vaishnavi Jaiswal";
                if(name.equals(name)){
                    throw new UserDefinedException("Name is Vaishnavi");
                }
            }
    
        catch(UserDefinedException e){
                System.out.println(e.getMessage());
        }

    //E. KEYWORDS USED IN EXCEPTION HANDLING

        //I. try
        try {
            System.out.println("Trying to divide");
            int result = 10 / 0; // Exception Occurs Here

            System.out.println("This will not Execute.");

        } 

        catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }


        //II. catch
        try {
            int[] arr = new int[3];
            arr[5] = 10; // Exception Occurs Here
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } 
        
        catch (Exception e) {
            System.out.println("Generic Exception: " + e.getMessage());
        }
        /* Note: If an ArrayIndexOutOfBoundsException occurs, it is caught by the first block.
           If another exception occurs, it is caught by the more generic Exception block. */


        //III. finally
        try {
            System.out.println("Opening file...");
            int result = 10 / 0; // Exception Occurs
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        
        finally {
            System.out.println("Closing file...");
        }


        //IV. throw
        try {
           divide(10, 0); // Throws Exception
        } 

        catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }


        //V. throws
        try {
            readFile(); 
        } 
        
        catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }


    //F. METHODS TO PRINT EXCEPTIONS
        try {
            System.out.println("Opening file...");
            int result = 10 / 0; // Exception Occurs
        } 
        
        catch (ArithmeticException e) {
            //I. getMessage()
                System.out.println(e.getMessage());


                //II. toString()
                System.out.println(e.toString());

                
                //III. printStackTrace()
                e.printStackTrace();
        } 
    }

    static int divide(int a, int b) throws ArithmeticException{

        if(b == 0){
            throw new ArithmeticException("b should not be equal to zero!");
        }
        /* Note: Here if only return a/b was enough to handle the error,
           as when this function is called automatically ArithmeticException is thrown
           but we explicitly throw an exception as the default ArithmeticException 
           thrown by the JVM when dividing by zero has a generic message: / by zero.
           In our code, we explicitly throw an exception with a custom message. This
           message is more meaningful and clarifies the context of the error, 
           especially in larger, more complex systems. It provides better debugging
           and logging information. 
           
           We decouple the exception from JVM-internal triggers
           like 1 / 0. This gives us control to define when and why the exception is 
           raised. For example, we might use the same logic (b == 0) for something other
           than division but still want to raise an error.
           
           Preemptive Exception Handling: If we rely on the JVM's automatic exception for
           1 / 0, it will occur only when the division is actually executed. However, 
           in some cases, we might want to catch the issue before attempting the operation. */

        return a/b;
    }

    static void readFile() throws IOException {
            FileReader file = new FileReader("nonexistent.txt");
    }

}

