package com.summer.arithmetic.bubblesort;

import com.summer.arithmetic.PrintUtil;

/**
 * @Description: 冒泡排序
 * @Author: summer
 * @CreateDate: 2021/4/13
 */
public class BubbleSort {
    public static void main(String[] g) {
        int[] arr = {3, 2, 10, 7, 18, 6, 9, 1};


        //外层循环是排序的趟数
        for (int i = 0; i < arr.length - 1; i++) {

            //内层循环是当前趟数需要比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //System.out.println("i=" + i + ",j=" + j);
                int a = arr[j];
                int b = arr[j + 1];
                if (a > b) {
                    arr[j] = b;
                    arr[j + 1] = a;
                }
            }
            PrintUtil.print(arr);
        }

    }


}
