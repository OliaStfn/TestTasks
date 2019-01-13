package com.olhastfn.practice;

import java.util.Scanner;

/**
 * Created on 28.12.2018.
 */
public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Enter size h: ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        draw(h);
    }

    public void draw(int h) {
        int spaces = (1 + 2 * (h-1)) / 2;
        int size = 1;
        for (int i = 0; i < h; i++) {
            for (int s = 0; s< spaces; s++){
                System.out.print(" ");
            }
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            size += 2;
            spaces--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Triangle().draw(10);
    }
}
