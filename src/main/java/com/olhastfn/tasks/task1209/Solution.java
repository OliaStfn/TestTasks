package com.olhastfn.tasks.task1209;

/**
 * Created on 06.11.2018.
 */
public class Solution {
    public static void main(String[] args) {
        min(10, 5);
        min(5.5, 9.1);
        min(133, 546);
    }

    public static int min(int a, int b) {
        if (a > b) return b;
        return a;
    }

    public static long min(long c, long d) {
        if (c > d) return d;
        return c;
    }

    public static double min(double n, double m) {
        if (n > m) return m;
        return n;
    }
}
