package com.olhastfn.tasks.task0219;

/**
 * Created on 04.11.2018.
 */
public class Solution {
    public static void main(String[] args) {
        print3("I HATE YOU");
        print3("GO AWAY");
    }


    public static void print3(String text) {

        for (int i = 0; i < 3; i++) {
            System.out.print(text+" ");
        }
    }
}
