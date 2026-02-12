package exceptionhandling;
import java.util.*;
public class TryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10;
        int b=0;
        try{
            int ans=a/b;
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Program completed");
            sc.close();
        }
    }
}
