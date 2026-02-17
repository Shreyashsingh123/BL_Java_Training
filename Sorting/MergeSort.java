package Sorting;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    merge(arr,0,arr.length-1);   // 0 1 2 3 4 //5 -1 =4 
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
// public static int[] merge(int arr[],int s, int e){
//     if(s==e){
//         int a[]=new int[1];
//         a[0]=arr[s];
//         return a;
//     }
//     int mid=s+(e-s)/2;
//     int ans1[]=merge(arr,s,mid);
//     int ans2[]=merge(arr,mid+1,e);
//     return solve(ans1,ans2);

// }
public static void merge(int arr[],int s, int e){
    if(s<e){
    //int mid=s+(e-s)/2;
    int mid=(s+e)/2;
    merge(arr,s,mid);  //left part
    merge(arr,mid+1,e);  //right part 
    solve(arr,s,mid,e);  //merge 
    }
}

public static void solve(int arr1[],int s,int mid,int e){
    int i=s,j=mid+1,k=s;   //s =0 e=4
   int ans[]=new int[arr1.length];  
   while(i<=mid && j<=e){
        if(arr1[i]<=arr1[j]){    
            ans[k]=arr1[i];
            i++;
            k++;
        }
        else{
            ans[k]=arr1[j];
            k++;
            j++;
        }
    }
    if(j>e){   
    while(i<=mid){
        ans[k]=arr1[i];
        k++;
        i++;
    }
}else{
    while(j<=e){
        ans[k]=arr1[j];
        j++;
        k++;
    }
}
    for(int l=s;l<=e;l++){
        arr1[l]=ans[l];
    }
}
}
// public static int[] solve(int arr1[],int arr2[]){
//     int i=0,j=0,k=0;
//     int ans[]=new int[arr1.length+arr2.length];
//     int m=arr1.length;
//     int n=arr2.length;
//     while(i<m && j<n){
//         if(arr1[i]<arr2[j]){
//             ans[k++]=arr1[i++];
//         }
//         else{
//             ans[k++]=arr2[j++];
//         }
//     }
//     while(i<m){
//         ans[k++]=arr1[i++];
//     }
//     while(j<n){
//         ans[k++]=arr2[j++];
//     }
//     // print(ans);
//     return ans;
// }
// public static void print(int arr[]){
//     for(int i:arr){
//         System.out.print(i+" ");
//     }
// }


