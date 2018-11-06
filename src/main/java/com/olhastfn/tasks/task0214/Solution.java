package com.olhastfn.tasks.task0214;

/**
 * Created on 04.11.2018.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(min(10, 5));
        System.out.println(min(-10, 5));
        System.out.println(min(-10, -5));

    }

    public static int min(int a, int b) {
        if (a > b) return b;
        else return a;

//        return (a > b) ? b : a;
    }
}
