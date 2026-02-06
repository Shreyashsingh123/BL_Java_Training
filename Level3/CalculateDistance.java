package Level3;
import java.util.*;
public class CalculateDistance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance = CalculateDistance(x1, y1, x2, y2);
        double[] arr = CalculateLineEquation(x1, y1, x2, y2);
        System.out.println("Euclidean Distance is : " + distance);
        System.out.println("Slope is: " + arr[0]);
        System.out.println("Y Intercept is : " + arr[1]);
        System.out.println("Equation of line: y = " + arr[0] + "x + " + arr[1]);
        sc.close();
    }

    public static double CalculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] CalculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double constant = y1 - slope * x1;
        return new double[]{slope, constant};
    }
}