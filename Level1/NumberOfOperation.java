package Level1;
import java.util.*;
public class NumberOfOperation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println(arr[i]+" is Even and Positive number");
                }
                else{
                    System.out.println(arr[i] + " is Odd and Possitive number");
                }
            }
            else if(arr[i]<0){
                System.out.println(arr[i]+" is a Negative number");
            }
            else{
                System.out.println(arr[i] + " is zero");
            }
        }
        int first = arr[0];
        int last = arr[4];
        if(first==last){
            System.out.println("First and Last numbers are same");
        }
        else if(first>last){
            System.out.println("First number is greater than last number");
        }
        else{
            System.out.println("First Number is smaller than The last number");
        }
    }
}