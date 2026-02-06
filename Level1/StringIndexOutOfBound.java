package Level1;
import java.util.*;
public class StringIndexOutOfBound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         try{
            Generateexception(s);
         }
         catch(Exception e){
            System.out.println("Runtime exception ");
         }
         handleexception(s);
    }
    public static void Generateexception(String s){
        System.out.println("Generating Exception");
        char ch=s.charAt(s.length());
    }
    public static void handleexception(String s){
        System.out.println("Handling exception");
       
        try{
            char ch=s.charAt(s.length());
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndex out of bound exception found");
        }
    }
}
