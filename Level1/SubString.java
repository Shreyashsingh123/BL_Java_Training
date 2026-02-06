package Level1;
import java.util.*;
public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();
        String ans1=sub(str,start,end);
        String ans2=str.substring(start,end);
        if(ans1.equals(ans2)){
            System.out.println("Both the Substrings are equal");
        }
        else{
            System.out.println("Both substring are not equal ");
        }
    }
    public static String sub(String str,int s,int e){
        StringBuilder sb=new StringBuilder();
        for(int i=s;i<e;i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
