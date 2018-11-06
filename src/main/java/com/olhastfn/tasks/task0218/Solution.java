package com.olhastfn.tasks.task0218;

/**
 * Created on 04.11.2018.
 */
public class Solution {
    public static void main(String[] args) {
        print3("I HATE YOU");
    }


    public static void print3(String text) {
        System.out.println("\t\t------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("\t\t|"+text+"|");
        }
        System.out.println("\t\t------------");
    }
}
