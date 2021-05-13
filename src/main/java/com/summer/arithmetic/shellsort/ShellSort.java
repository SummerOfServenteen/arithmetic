package com.summer.arithmetic.shellsort;

/**
 * @Description: 希尔排序
 * @Author: summer
 * @CreateDate: 2021/5/12
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arrays = {2, 5, 1, 3, 4, 6};

        shellSort(arrays);
    }

    public static void shellSort(int[] arrays) {


        //增量每次都/2 步长
        for (int step = arrays.length / 2; step > 0; step /= 2) {

            //从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < arrays.length; i++) {

                int j = i;
                int temp = arrays[j];

                // j - step 就是代表与它同组隔壁的元素
                while (j - step >= 0 && arrays[j - step] > temp) {
                    arrays[j] = arrays[j - step];
                    j = j - step;
                }
                arrays[j] = temp;
            }
        }


    }
}
