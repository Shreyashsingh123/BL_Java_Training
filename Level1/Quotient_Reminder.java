package Level1;
import java.util.*;
public class Quotient_Reminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
       int num2=sc.nextInt();
      int ans[]= divide(num1,num2);
      System.out.println("The quotient is :"+ans[0]);
      System.out.println("The reminder is :" +ans[1]);
    }
    public static int[] divide(int n1,int n2){
       int q=0;
       int r=0;
       q=(n1/n2);
       r=(n1%n2);
       int ans[]=new int[2];
       ans[0]=q;
       ans[1]=r;
       return ans;
    }
}
