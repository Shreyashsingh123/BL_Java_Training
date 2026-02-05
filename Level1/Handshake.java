package Level1;
import java.util.*;
public class Handshake {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of Student ");
    int n=sc.nextInt();
   int numberofhandshake=solve(n);
        System.out.println("Total number of handshake is  "+ numberofhandshake);
    }
    public static int solve(int n){
        int ans=0;
        ans=(n*(n-1))/2;
        return ans;
    }
}
