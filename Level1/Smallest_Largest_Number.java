package Level1;
import java.util.*;
public class Smallest_Largest_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        solve(num1,num2,num3);

    }
    public static void solve(int n1,int n2,int n3){
int min=0;
if(n1<n2 && n1<n3){
    min=n1;
}
else if(n2<n1 && n2<n3){
    min=n2;
}
else{
    min=n3;
}
int max=0;
if(n1>n2 && n1>n3){
    max=n1;
}
else if(n2>n1 && n2>n3){
    max=n2;
}
else{
    max=n3;
}
System.out.println("The minimum number between "+ n1+" , "+n2+" , "+n3+" , is: "+min);
System.out.println("The maximum number between "+ n1+" , "+n2+" , "+n3+" , is: "+max);
    }
}
