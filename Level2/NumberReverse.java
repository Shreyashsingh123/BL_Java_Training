package Level2;
import java.util.*;
public class NumberReverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=n;
        int c=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        int[] arr = new int[c];
        int b=0;
        while(num!=0){
            int r = num%10;
            arr[b]=r;
            b++;
            num=num/10;
        }
        System.out.println("Reversed number is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}