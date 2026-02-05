package Level2;
import java.util.*;
public class Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans[]=factor(num);
        System.out.println("The factors are:");
        for(int i:ans){
            System.out.println(i);
        }
        int sum=sum(ans);
        int product=product(ans);
        int sq=square(ans);
        System.out.println("The sum of all factors is  "+sum);
        System.out.println("The product of all the factors is  "+product);
        System.out.println("The sum of squares of all factors is :" +sq);
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
    public static int square(int arr[]){
        int sum=0;
        for(int i:arr){
            int sq=i*i;
            sum+=sq;
        }
        return sum;
    }
}
