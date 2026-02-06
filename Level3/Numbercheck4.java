package Level3;
import java.util.*;
public class Numbercheck4 {
    public static boolean CheckPrime(int num) {
        int c = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }
   public static boolean CheckNeon(int n) {
        int square = n * n;
        int s = 0;
        while (square != 0) {
            int r = square % 10;
            s = s + r;
            square = square / 10;
        }
        if (s == n) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean CheckSpy(int n) {
        int sum = 0;
        int product = 1;
        int k = n;
        while (k != 0) {
            int rem = k % 10;
            sum = sum + rem;
            product = product * rem;
            k = k / 10;
        }
        if (sum == product) {
            return true;
        } else {
            return false;
        }
    }
   public static boolean Automorphic(int n) {
        int sq = n * n;
        while (n > 0) {
            if (n % 10 != sq % 10){
                return false;
            }
            n /= 10;
            sq /= 10;
        }
        return true;
    }
public static boolean CheckBuzz(int n){
        if(n%7==0 || n%10==7){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Prime number is :" + CheckPrime(num));
        System.out.println("Neon Number is : " + CheckNeon(num));
        System.out.println("Spy Number is : " +CheckSpy(num));
        System.out.println("Automorphic Number is : " + Automorphic(num));
        System.out.println("Buzz Number is: "+CheckBuzz(num));
    }
    }