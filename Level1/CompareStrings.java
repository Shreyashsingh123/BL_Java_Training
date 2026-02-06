package Level1;
import java.util.*;
public class CompareStrings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1=str1.trim();
        str2=str2.trim();
        boolean ans = CompareString(str1,str2);
        if(ans){
            System.out.println("Both the Strings are Equal");
        }
        else{
            System.out.println("Both the Strings are not Equal");
        }

        if(str1.equals(str2)){
            System.out.println("Both the Strings are Equal by using Inbuilt function");
        }
        else{
            System.out.println("String are not Equal");
        }
    }
    public static boolean CompareString(String str,String str1){
        if(str.length()!=str1.length()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str1.charAt(i)){
                return false;
            }
        }
        return true;
    }
}