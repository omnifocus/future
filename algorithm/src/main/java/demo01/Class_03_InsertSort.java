package demo01;

import java.util.Arrays;

public class Class_03_InsertSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,4,3,2};
        doInsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void doInsertSort(int[] arr) {
        for (int i=1;i<arr.length;i++) {
            for (int j=i;j>0;j--) {
                if (arr[j] < arr[j-1] ) {
                    doswap(arr,j,j-1);
                } else
                    // 跟bubble sort 和 selection sort 不同的地方
                    break;
            }
        }
    }

    private static void doswap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
