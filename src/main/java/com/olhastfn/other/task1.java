package com.olhastfn.other;

/**
 * Created on 22.11.2018.
 */
public class task1 {


    public static double min(double a, double b, double c) {
        if (a < b && a < c) return a;
        else if (b < a && b < c) return b;
        else return c;
    }

    public static void main(String[] args) {
        double a = 25;
        double b = 37;
        double c = 29;
        System.out.println(min(a,b,c));
    }
}
