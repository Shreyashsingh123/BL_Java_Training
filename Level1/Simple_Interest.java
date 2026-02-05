
package Level1;
import java.util.*;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        double ans=solve(principal,rate,time);
        System.out.print("The Simple Interest is  "+ ans+"  for principal  "+principal+" , Rate of Interest  "+ rate +"and time "+time);
    }
    public static double solve(int p,int r,int t){
        double simpleinterest=0;
        simpleinterest=(p*r*t)/100;
        
        return simpleinterest;
    }
}
