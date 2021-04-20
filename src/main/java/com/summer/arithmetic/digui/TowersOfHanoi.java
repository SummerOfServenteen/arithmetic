package com.summer.arithmetic.digui;

public class TowersOfHanoi {
    static int m = 0;//标记移动次数

    static int stack = 0;

    //实现移动的函数
    public static void move(int disks, char N, char M) {
        System.out.println("第" + (++m) + " 次移动 : " + " 把 " + disks + " 号圆盘从 " + N + " ->移到->  " + M);
    }

    //递归实现汉诺塔的函数
    public static void hanoi(int n, char from, char support, char target) {
        stack ++;
        System.out.println("第" + stack + "进栈,n="+n);
        //圆盘只有一个时，只需将其从A塔移到C塔
        if (n == 1) {
            //将编号为1的圆盘从A移到C
            TowersOfHanoi.move(1, from, target);
        } else {
            //递归，把A塔上编号1~n-1的圆盘移到B上，以C为辅助塔
            hanoi(n - 1, from, target, support);
            System.out.println("第" + stack + "进栈,n="+n);
            //把A塔上编号为n的圆盘移到C上
            TowersOfHanoi.move(n, from, target);
            //递归，把B塔上编号1~n-1的圆盘移到C上，以A为辅助塔
            hanoi(n - 1, support, from, target);
        }
    }

    public static void main(String[] args) {

        char A = 'A';
        char B = 'B';
        char C = 'C';
        System.out.println("******************************************************************************************");
        System.out.println("这是汉诺塔问题（把A塔上编号从小号到大号的圆盘从A塔通过B辅助塔移动到C塔上去");
        System.out.println("******************************************************************************************");
        int disks = 3;
        TowersOfHanoi.hanoi(disks, A, B, C);
        System.out.println(">>移动了" + m + "次，把A上的圆盘都移动到了C上");
    }
}
