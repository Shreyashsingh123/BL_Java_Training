package Level2;
import java.util.*;
public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double yardtofeet=yardtofeet(n);
        double feettoyard=feettoyard(n);
        double metertoinches=metertoinches(n);
        double inchestometer=inchestometer(n);
        double InchestoCentimeter=InchestoCentimeter(n);
        System.out.println(n+" yard in feed is :"+yardtofeet);
        System.out.println(n+" feet in yards is :"+feettoyard);
        System.out.println(n+" meter in inches "+ metertoinches);
        System.out.println(n+" inches in meter is :"+ inchestometer);
        System.out.println(n+" inches in centimeter is :"+ InchestoCentimeter);
    }   
    public static double yardtofeet(int n){
        double ans=0;
        ans=n*3;
        return ans;
    }
    public static double feettoyard(int n){
        double ans=0;
        ans=n*0.333333;
        return ans;
    }
    public static double metertoinches(int n){
        double ans=0;
        ans=n*39.3701;
        return ans;
    }
    public static double inchestometer(int n){
        double ans=0;
        ans=n*0.0254;
        return ans;
    }
    public static double InchestoCentimeter(int n){
        double ans=0;
        ans=n*2.54;
        return ans;
    }
}
