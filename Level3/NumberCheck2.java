package Level3;
import java.util.*;
class NumberChecker{
    public static void count(int n){
        int c=0;
        int num=n;
        while(n>0){
            c++;
            n/=10;
        }
        System.out.println("The number of digits is:"+c);
        storedigits(num,c);
    }

public static void storedigits(int n,int c){
    int arr[]=new int[c];
    int num=n;
    int i=c;
    while(n>0){
        arr[--i]=n%10;
        n/=10;
    }
    
    for(int j:arr){
        System.out.print(j+" ");
    }
    System.out.println();
    sum(arr,num);
    square(arr);
}
public static void sum(int arr[],int num){
    int sum=0;
    for(int i:arr){
        sum+=i;
    }
    System.out.println("The sum of digits is : "+sum);
    harshad(num,sum);
}
public static void square(int arr[]){
    double sq=0;
    for(int i:arr){
        double a=Math.pow(i,2);
        sq+=a;
    }
    System.out.println("The sum of squares of digits is "+sq);
}
public static void harshad(int n,int sum){
    if(n%sum==0){
        System.out.println("The given number is Harshad number");
    }
    else{
        System.out.println("The given number is not  harshad number");
    }
}
}
public class NumberCheck2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NumberChecker.count(n);
    
    }
}
