package exceptionhandling;

public class Exception2 {

    public static void fun(int a)throws ArithmeticException {
    
     try{
         int ans=a/0;
        }
        catch(ArithmeticException e){
            throw new ArithmeticException("Divivde by zero exception occurs"+e);
        }
        
    }
    public static void main(String[] args) {
        int a=15;
        // int ans=0;
        try{
        fun(a);
        }
        catch (ArithmeticException e){
            System.out.println("Caught exception is"+e);

        }
        System.out.println();
    }
}
