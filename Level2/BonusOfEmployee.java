package Level2;
import java.util.*;
public class BonusOfEmployee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] serviceyear = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalbonus = 0;
        double TotalOldSal = 0;
        double TotalNewSal = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter employee details " + (i + 1));
            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter Years of Service: ");
            serviceyear[i] = sc.nextDouble();
            if (salary[i] <= 0 || serviceyear[i] < 0) {
                System.out.println("Invalid details!");
                i--;
                continue;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (serviceyear[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalbonus += bonus[i];
            TotalOldSal += salary[i];
            TotalNewSal += newSalary[i];
        }
        System.out.println();
        System.out.println("Total Bonus is = " + totalbonus);
        System.out.println("Total Old Salary is = " + TotalOldSal);
        System.out.println("Total New Salary is = " + TotalNewSal);
    }
}
