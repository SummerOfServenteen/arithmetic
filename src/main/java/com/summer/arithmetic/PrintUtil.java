package com.summer.arithmetic;

/**
 * @Description: java类作用描述
 * @Author: summer
 * @CreateDate: 2021/4/14
 */
public class PrintUtil {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }

    }
}
