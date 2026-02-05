package Level2;
import java.util.*;
public class CompareAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age[]=new int[3];
        System.out.println("Enter age of 3 freinds");
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
        }
        int height[]=new int[3];
        System.out.println("Enter height of 3 freinds");
        for(int i=0;i<height.length;i++){
            height[i]=sc.nextInt();
        }
        solve(age);
        solve2(height);
    }
    public static void solve(int age[]){
        int youngest=0;
        if(age[0]<age[1]&& age[0]<age[2]){
            youngest=age[0];
        }
        else if(age[1]<age[0] &&age[1]<age[2]){
            youngest=age[1];
        }
        else{
            youngest=age[2];
        }
System.out.println("The youngest freind is: "+youngest);
    }
    public static void solve2(int height[]){
        int tallest=0;
        if(height[0]>height[1]&& height[0]>height[2]){
            tallest=height[0];
        }
        else if(height[1]>height[0] &&height[1]>height[2]){
            tallest=height[1];
        }
        else{
            tallest=height[2];
        }
System.out.println("The tallest freind is: "+tallest);
    }
}
 