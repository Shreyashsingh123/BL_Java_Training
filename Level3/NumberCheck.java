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
        duck(arr);
        armstrong(arr,num);
        smallest(arr);
    }
public static void duck(int num[]){
    for(int i:num){
        if(i==0){
            System.out.println("Given number is not a duck number");
            return;
        }
    }
    System.out.println("the given number is a duck number");
}
public static void armstrong(int arr[],int n){
    int sum=0;
    // int len=arr.length;
    for(int i:arr){
        sum+=(Math.pow(i,3));
    }
    if(sum==n){
        System.out.println(n +" is a Armstrong number");
    }
    else{
        System.out.println(n +" is not a armstrong number");
    }
}
public static void smallest(int arr[]){
    int smallest=Integer.MAX_VALUE;
    int sec=Integer.MAX_VALUE;
    int largest=Integer.MIN_VALUE;
    int secl=Integer.MIN_VALUE;
    for(int i:arr){
        smallest=Math.min(smallest,i);
        largest=Math.max(largest,i);
    }
    for(int i:arr){
        if(i==smallest)continue;
        if(i==largest)continue;
        sec=Math.min(sec,i);
        secl=Math.max(secl,i);
    }
    System.out.println("Smallest number is"+smallest);
    System.out.println("Second smallest number is "+sec);
    System.out.println("Largest number is "+largest);
    System.out.println("Second largest number is "+secl);

} 
}
public class NumberCheck {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            NumberChecker.count(n);
        
        }
}
