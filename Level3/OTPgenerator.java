package Level3;
import java.util.*;
public class OTPgenerator {
    public static int[] GenerateOTP(){
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            int k=0;
        for(int j=0;j<6;j++){
            int ran=(int)(Math.random()*10);
            k=k*10+ran;
        }
        arr[i]=k;
    }
        return arr;
    }

    public static boolean[] UniqueOTP(int arr[]){
        boolean ans[]=new boolean[10];
        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(k==arr[j] || i!=j){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans[i]=true;
            }
            else{
                ans[i]=false;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=GenerateOTP();
        boolean ans[]=UniqueOTP(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" "+ans[1]+" is a UniqueOTP otp");
        }
        
    }
}
