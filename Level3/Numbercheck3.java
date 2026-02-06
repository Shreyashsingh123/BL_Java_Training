package Level3;
import java.util.*;
class NumberChecker3{
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
public static int[] reverse(int arr[]){
int ans[]=new int[arr.length];
int k=0;
for(int i=arr.length-1;i>=0;i--){
    ans[k]=arr[i];
    k++;
}
return ans;
}
public static boolean compare(int arr[],int rev[]){
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=rev[i]){
            return false;
        }
    }
    return true;
}
public static boolean duck(int num[]){
    for(int i:num){
        if(i==0){
           
            return false;
        }
    }
    return true;
   
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int c= count(n);
        System.out.println("The number of digits is:"+c);
       int arr[]= storedigits(n,c);
       for(int j:arr){
           System.out.print(j+" ");
        }
          System.out.println();
          int rev[]=reverse(arr);
          System.out.println("The reversed array is :");
          for(int i:rev){
            System.out.print(i+" ");
          }
          System.out.println();
          boolean comp=compare(arr,rev);
          if(comp){
            System.out.println("Both the arrays are same");
          }
          else{
            System.out.println("Both arrays are not same");
          }
          boolean isPalindrome=compare(arr,rev);
          if(isPalindrome){
            System.out.println("The given number is a palindrome number");
          }
          else{
            System.out.println("The given number is not a palindrome");
          }
          boolean duck=duck(arr);
          if(duck){
            System.out.println("Given number is not a duck number");
          }
          else{
            System.out.println("Given number is a duck number");
          }
    }
}
