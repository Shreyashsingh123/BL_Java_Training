package Level2;
import java.util.*;
public class Natural_Number_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=recursive(n,0);
        int ans2=solve(n);
        System.out.println(ans);
        System.out.println(ans2);
        if(ans==ans2){
            System.out.println("Both the result are same");
        }
       
    }
    public static int recursive(int n,int ans){
        // int ans=0;
        if(n==0){
            return ans;
        }
        else{
        return recursive(n-1,ans+n);
        }
    }
    public static int solve(int n){
        int ans=0;
        ans=(n*(n+1))/2;
        return ans;
    }
}
