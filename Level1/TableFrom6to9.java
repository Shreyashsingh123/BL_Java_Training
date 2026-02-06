package Level1;
import java.util.*;
public class TableFrom6to9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] Result = new int[4];
        int idx = 0;
        for (int i = 6; i <= 9; i++) {
            Result[idx] = number * i;
            idx++;
        }
        idx = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + Result[idx]);
            idx++;
        }
    }
}
