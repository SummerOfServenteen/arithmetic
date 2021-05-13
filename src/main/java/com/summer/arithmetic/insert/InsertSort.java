package com.summer.arithmetic.insert;

import com.summer.arithmetic.PrintUtil;

/**
 * @Description: 插入排序
 * @Author: summer
 * @CreateDate: 2021/4/15
 */
public class InsertSort {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        int[] data = {3, 2, 10, 7, 18, 6, 9, 1};
        int tempValue;
        for (int i = 1; i < data.length; i++) {
            tempValue = data[i];

            int tempIndex = i;

            while (tempValue < data[tempIndex - 1]) {
                data[tempIndex] = data[tempIndex - 1];
                tempIndex--;
                if (tempIndex < 1) {
                    break;
                }
            }
            data[tempIndex] = tempValue;
        }
        PrintUtil.print(data);
    }

    public static void method2() {
        int[] data = {3, 2, 10, 7, 18, 6, 9, 1};
        int tempValue;
        for (int i = 1; i < data.length; i++) {
            tempValue = data[i];

            int index = i;
            boolean flag = false;
            for (int j = i - 1; j >= 0; j--) {

                int a = data[j];
                if (tempValue < a) {
                    data[j+1] = a;
                    index = j;
                    flag = true;
                } else {
                    break;
                }

            }
            if(flag){
                data[index] = tempValue;
            }

            PrintUtil.print(data);

        }
        //PrintUtil.print(data);
    }


}
