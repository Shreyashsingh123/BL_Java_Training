package Level1;
import java.util.*;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=check(n);
        switch(num){
            case 0:
                System.out.print("The given number "+n +"  is zero");
                break;
            case 1:
                System.out.print("The given number "+n +"  is a positive number");
                break;
            case -1:
                System.out.print("The given number "+n +"  is a negative number");
                 break;
                default:
                System.out.println("Invalid Number");
        }
    }
    public static int check(int n){
        if(n<0){
            return -1;
        }
        else if(n>0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
