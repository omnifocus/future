package demo01;

public class Class_01_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 8, 5, 4, 6, 7};
        selectSort(arr);
        display(arr);
    }

    private static void display(int[] arr) {
        for (int i : arr) {
            System.out.print("\t" + i);
        }
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {  //不是arr.length
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            }
            doswap(arr, i, minIndex);
        }
    }

    private static void doswap(int[] arr, int i, int minIndex) {
        if (i == minIndex) return;
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
