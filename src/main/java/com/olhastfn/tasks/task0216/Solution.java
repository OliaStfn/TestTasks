package com.olhastfn.tasks.task0216;

/**
 * Created on 04.11.2018.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(min(1, 6, 9));
        System.out.println(min(1, -6, 9));
        System.out.println(min(1, -6, -9));
        System.out.println(min(-9, -9, -6));

    }

    public static int min(int a, int b, int c) {
      /*  if (a >= b && c >= b) {
            return b;
        } else if (b >= a && c >= a) return a;
        return c;*/

        int result = a;
        if (b < result) result = b;
        if (c < result) result = c;
        return result;
    }
}
