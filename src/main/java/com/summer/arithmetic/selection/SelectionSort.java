package com.summer.arithmetic.selection;

import com.summer.arithmetic.PrintUtil;

/**
 * @Description: 选择排序
 * @Author: summer
 * @CreateDate: 2021/4/14
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {3, 2, 10, 7, 18, 6, 9, 1};
        int max;
        int tempIndex;
        for (int i = 0; i < data.length - 1; i++) {

            //初始值都是0
            tempIndex = 0;
            max = data[tempIndex];
            for (int j = 0; j < data.length - 1 - i; j++) {
                int nextValue = data[j + 1];

                if (max < nextValue) {
                    tempIndex = j + 1;
                    max = nextValue;
                }
            }
            System.out.println("当前最大值：" + max);
            //经过一轮遍历后，选出当次最大值和对应的角标，跟最后一位置换
            data[tempIndex] = data[data.length - 1 - i];
            data[data.length - 1 - i] = max;

        }

        PrintUtil.print(data);
    }
}
