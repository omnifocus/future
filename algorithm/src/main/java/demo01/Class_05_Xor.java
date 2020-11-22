package demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 一个数组中有一种数出现奇次，其他数出现偶次，怎么找到
 一个数组中有两种数出现奇次，其他数出现偶次，怎么找到
 取一个数的二进制位上1的个数
 */
public class Class_05_Xor {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 2, 2, 3, 3, 5, 5};
//        int theNum = getTheNum1(arr);
        int[] arr2 = {1, 1, 1, 1, 1, 2, 2,2, 3, 3, 5, 5};
        List nums = getTheNum2(arr2);
        System.out.println(nums);

        int a = 10;
        System.out.println(getBitsfor1(a));
    }

    /**
     * 取一个数的二进制位上1的个数
     * @param a
     * @return
     */
    private static int getBitsfor1(int a) {
        int count = 0;
        while (a != 0) {
            int temp = a & ((~a) + 1);
            count ++;
            //抹掉当前位1
            a ^= temp;
        }
        return count;

    }

    /*
一个数组中有两种数出现奇次，其他数出现偶次，怎么找到
*/
    private static List getTheNum2(int[] arr) {
        int xor1 = 0;
        for (int i : arr) {
            xor1 ^= i;
        }
        // xor1 保存了两个数的异或

        // 找到其中为1的一位（目前选最右边）,即这两数的这一位一定不同
        int distinguishBit = xor1 & (~xor1 + 1);

        int xor2 = 0;

        for (int i: arr) {
            if ((i & distinguishBit) == 1) {
                //分别出来一个数
                xor2 ^= i;
            }
        }

        List list = new ArrayList();
        list.add(xor2);
        list.add(xor1 ^ xor2 );

        return list;
    }

    /*
     一个数组中有一种数出现奇次，其他数出现偶次，怎么找到
     */
    private static int getTheNum1(int[] arr) {
        int val = 0;
        for (int i : arr) {
            val ^= i;
        }
        return val;
    }




}
