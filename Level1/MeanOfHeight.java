package Level1;
import java.util.*;
public class MeanOfHeight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int str=0;
        for(int i=0;i<11;i++){
            arr[i]=sc.nextInt();
            str=str+arr[i];
        }
        double mean = str/11;
        System.out.println("Mean of height is: " + mean);
    }
}