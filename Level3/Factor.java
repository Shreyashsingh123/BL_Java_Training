package Level3;
import java.util.*;
import java.util.Scanner;

public class Factor {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans[]=factor(num);
        System.out.println("The factors are:");
        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
        int largest=max(ans);
        System.out.println("The largest factor is :"+largest);
        int sum=sum(ans);
        System.out.println("The sum of factor is:"+sum);
        int product=product(ans);
        System.out.println("The product of all the factors is  "+product);
        int cube=CubeProduct(ans);
        System.out.println("The product of cube of array is  "+cube);
    }
    public static int[] factor(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)c++;
        }
        int ans[]=new int[c];
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans[k]=i;
                k++;
            }
        }
        return ans;
    }
  public static int max(int arr[]){
    int max=Integer.MIN_VALUE;
    for(int i:arr){
        max=Math.max(max,i);
    }
    return max;
  }
public static int sum(int arr[]){
    int sum=0;
    for(int i:arr){
        sum+=i;
    }
    return sum;
}
public static int product(int arr[]){
    int product=1;
    for(int i:arr){
        product*=i;
    }
    return product;
}
public static int CubeProduct(int arr[]){
    for(int i=0;i<arr.length;i++){
        double c=Math.pow(arr[i],3);
        arr[i]=(int)c;
    }
    int pro=1;
    for(int i:arr){
        pro*=i;
    }
    return pro;
}
}
