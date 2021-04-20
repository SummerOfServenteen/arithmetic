package com.summer.arithmetic.digui;

/**
 * @Description: java类作用描述
 * @Author: summer
 * @CreateDate: 2021/4/19
 */
public class Digui {
    public static void main(String[] args) {
        //{1 1 2 3 5 8 13 21 34 55..... n }
        System.out.println(fibonacci(4));
    }

    public static int fibonacci(int n) {
        if (n < 1) {
            throw new RuntimeException("入参不合法");

        }
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }


    }

    /**
     * 汉诺塔
     *
     * @param n        n个盘子
     * @param start    起始柱子
     * @param transfer 中转柱子
     * @param target   目标柱子
     */
    public static void hanoi(int n, char start, char transfer, char target) {
        //只有一个盘子，直接搬到目标柱子
        if (n == 1) {
            System.out.println(start + "---->" + target);
        } else {
            //起始柱子借助目标柱子将盘子都移动到中转柱子中(除了最大的盘子)
            hanoi(n - 1, start, target, transfer);
            System.out.println(start + "---->" + target);
            //中转柱子借助起始柱子将盘子都移动到目标柱子中
            hanoi(n - 1, transfer, start, target);
        }
    }
}
