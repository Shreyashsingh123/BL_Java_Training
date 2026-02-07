package Sorting;

public class MergeSortDemo {

    static int a[] = {15, 5, 24, 8, 1, 3, 16, 10, 20};
    static int b[] = new int[a.length];

    public static void main(String[] args) {
        int lb = 0;
        int ub = a.length - 1;
        mergeSort(lb, ub);  //---> 
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void mergeSort(int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergeSort(lb, mid);  //left psrt
            mergeSort(mid + 1, ub);  //right part 
            merge(a, lb, mid, ub);  //--->
        }
    }
    public static void merge(int a[], int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = lb;
        while (i <= mid && j <= ub) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if(j>ub) {
        while (i <= mid) {
            b[k] = a[i];
            i++;
            k++;
        }
        }else {
        while (j <= ub) {
            b[k] = a[j];
            j++;
            k++;
           }
        }
        for (k = lb; k <= ub; k++) {
            a[k] = b[k];
        }
    }
}