package Level1;
import java.util.*;
public class CompareTwoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ans[]=solve(s);
        char ans2[]=s.toCharArray();
        if(Arrays.equals(ans,ans2)){
            System.out.println("Both the array are same");
        }
        else{
            System.out.println("Both the array are not same");
        }
    }
    public static char[] solve(String s){
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        return arr;
    }
}
