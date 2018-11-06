package com.olhastfn.tasks.task0217;

/**
 * Created on 04.11.2018.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(min(1, 6));
        System.out.println(min(1, -6, 9, 5));
        System.out.println(min(1, -6, -9, 2));
        System.out.println(min(-9, -9, -6, 11));
        System.out.println(min(-9, -9, -6, 1));

    }

    public static int min(int a, int b, int c, int d) {
        /*if (min(a, b) > min(c, d)) return min(c, d);
        return min(a, b);*/

        return min(min(a,b),min(c,d));
    }

    public static int min(int a, int b) {
        if (a > b) return b;
        return a;
    }
}
