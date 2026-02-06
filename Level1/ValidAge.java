package Level1;
import java.util.*;
public class ValidAge{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int[] age = new int[10];
        for(int i=0;i<10;i++){
            age[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(age[i]<0){
                System.out.println("Invalid Age");
            }
            else{
                if(age[i]>18){
                    System.out.println("Student having Age "+age[i]+" is eligible to vote");
                }
                else{
                    System.out.println("Student having Age "+age[i] + " is not eligible to vote");
                }
            }
        }
    }
}