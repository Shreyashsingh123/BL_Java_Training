package Level3;
import java.util.*;
public class HeightofFootballTeam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height[]=new int[11];
        for(int i=0;i<11;i++){
            int random = (int) (Math.random() * 101) + 150;
            height[i]=random;
        }
        int sum=sum(height);
        System.out.println("The sum of height is: "+sum);
        int mean=MeanHeight(height,sum);
        System.out.println("The mean height is : "+ mean);
        int sortest=sortest(height);
        System.out.println("Sortest height is : "+sortest);
        int longest=longest(height);
        System.out.println("Longest height is :"+longest);
    
    }
    public static int sum(int arr[]){
        int ans=0;
        for(int i:arr){
            ans+=i;
        }
        return ans;
    }
    public static int MeanHeight(int arr[],int sum){
        int len=arr.length;
        int mean=sum/len;
        return mean;

    }
    public static int sortest(int arr[]){
        int sort=1000;
        for(int i:arr){
            sort=Math.min(sort,i);
        }
        return sort;
    }
    public static int longest(int arr[]){
        int longest=0;
        for(int i:arr){
            longest=Math.max(longest,i);
        }
        return longest;
    }
}
