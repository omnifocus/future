package demo01;

import java.util.Arrays;

public class Class_02_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {19,29,17,16,14,15,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i=arr.length-1;i>0;i--) {
            for (int j=0;j<i;j++) {
                if (arr[j] > arr[j+1]) {
                    doswap(arr,j,j+1);
                }
            }
        }

    }

    private static void doswap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
