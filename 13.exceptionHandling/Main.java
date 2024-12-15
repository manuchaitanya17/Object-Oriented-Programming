// CHAPTER-14 EXCEPTION HANDLING

public class Main {

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("b should not be equal to zero!");
        }
        return a/b;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 0;

        try{
           divide(a, b); 
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("It will be always executed!");
        }

    }
}
