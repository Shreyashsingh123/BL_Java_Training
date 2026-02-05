package Level1;
import java.util.*;
public class Athlete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        int perimeter=(side1+side2+side3);
        double distance=5;
        double ans=numberofRounds(distance,perimeter);
        System.out.print("The number of round user need to complete 5km run is "+ ans);
    }
    public static double numberofRounds(double d,int p){
       d=d*1000;
       double ans=(d/p);
        return ans;
    }
}
