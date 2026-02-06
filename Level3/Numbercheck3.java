package Level3;
import java.util.*;
class NumberChecker{
    public static int count(int n){
        int c=0;
        int num=n;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }

public static int[] storedigits(int n,int c){
    int arr[]=new int[c];
    int num=n;
    int i=c;
    while(n>0){
        arr[--i]=n%10;
        n/=10;
    }
    return arr;
   
}
}
public class Numbercheck3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int c= NumberChecker.count(n);
        System.out.println("The number of digits is:"+c);
       int arr[]= NumberChecker.storedigits(n,c);
       for(int j:arr){
           System.out.print(j+" ");
        }
          System.out.println();
    }
}
