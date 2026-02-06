package Level1;
import java.util.*;
public class ArrayEvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid Number");
        }
        int[] even = new int[num / 2 + 1];
        int[] odd = new int[num / 2 + 1];
        int evenidx = 0;
        int oddidx = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                even[evenidx] = i;
                evenidx++;
            } else {
                odd[oddidx] = i;
                oddidx++;
            }
        }
        System.out.println("Odd Numbers are:");
        for (int i = 0; i < oddidx; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        System.out.println("Even Numbers are:");
        for (int i = 0; i < evenidx; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
