package Level2;
import java.util.*;
public class Max_Min{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        int c=0;
        while(n!=0){
            int r=n%10;
            arr[c] = r;
            c++;
            n=n/10;
        }
        Arrays.sort(arr);
        int l = arr.length;
        System.out.println("Largest Number is: "+arr[l-1]);
        System.out.println("Second Largest Number is : "+arr[l-2]);
    }
}