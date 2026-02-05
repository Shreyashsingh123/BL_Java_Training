package Level2;
import java.util.*;
public class Unitconverter2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double kilometertomiles=KilometerToMilesConverter(n);
        double FeettoYard=FeetToYardConverter(n);
        double InchesToMeter=InchesToMeterConverter(n);
        double FeetToMeter=FeetToMeterConverter(n);
        System.out.println(n+" km to miles: "+kilometertomiles);
        System.out.println(n+" feet to yard: "+FeettoYard);
        System.out.println(n+" inches to meter: "+InchesToMeter);
        System.out.println(n+" Feet to meter: "+FeetToMeter);
    }
    public static double KilometerToMilesConverter(int n){
        double ans=0.621371*(n);
        return ans;
    }
    public static double FeetToYardConverter(int n){
        double ans=1.60934*(n);
        return ans;
    }
    public static double InchesToMeterConverter(int n){
        double ans=3.28084*n;
        return ans;
    }
    public static double FeetToMeterConverter(int n){
        double ans=0.3048*n;
        return ans;
    }
}

