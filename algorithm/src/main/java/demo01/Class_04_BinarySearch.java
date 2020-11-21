package demo01;

public class Class_04_BinarySearch {


    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4};
        //无序 各不相等
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,4,3,2,1};
        int[] arr3 = {3,2,1,4,6,7};
        //大于等于2最左侧的位置
        //int index = binarySearchLeft(arr,2);
        //小于等于2最右侧的位置
//        int index = binarySearchRight(arr,1);
        int index = binarySearchLocalSmall(arr3);
        System.out.println(index);
    }
    //arr1 arr2 arr3 都测试 ，求局部最小值
    private static int binarySearchLocalSmall(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new RuntimeException("一个元素哪有!");
        }
        int pos = -1;
        if (arr[0] < arr[1]) {
            return 0;
        }
        if (arr[arr.length-2]  > arr[arr.length-1]) {
            return arr.length-1;
        }

        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (end > start) {
            if (arr[mid] > arr[mid-1]) {
                end = mid-1  ;
            }else {
                if (arr[mid] < arr[mid+1]) {
                    pos = mid;
                    break;
                } else {
                    start = mid+1 ;
                }
            }
//            if (arr[mid] > arr[mid-1]) {
//                end = mid-1  ;
//            }else {
//                if (arr[mid] < arr[mid+1]) {
//                    return mid;
//                } else {
//                    start = mid+1 ;
//                }
//            }
//            mid = (start + end ) / 2;


        }
        return pos;
    }

    //小于等于某个数最右侧的位置
    private static int binarySearchRight(int[] arr,int target) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int middleIndex = (startIndex + endIndex) / 2;
        int pos = -1;
        while (endIndex > startIndex) {
            if (arr[middleIndex] <= target) {
                pos = middleIndex;
                startIndex = middleIndex + 1;
            }
            if (arr[middleIndex] > target) {
                endIndex = middleIndex - 1;
            }

            middleIndex =  (startIndex + endIndex) / 2;
        }
        return pos;
    }

    //找大于等于某个数最左侧的位置
    private static int binarySearchLeft(int[] arr,int toFInd) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int middleIndex = (startIndex + endIndex) / 2;
        int point = -1; //如果最后找不到，-1返回

        while (endIndex > startIndex) {
            if (arr[middleIndex] >= toFInd) {
                point = middleIndex ;
                endIndex = middleIndex-1;
            }
            if (arr[middleIndex] < toFInd) {
                startIndex = middleIndex +1;
            }

            middleIndex = (startIndex + endIndex) / 2;
        }

        return point;

    }




}
