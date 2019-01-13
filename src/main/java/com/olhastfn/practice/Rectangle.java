package com.olhastfn.practice;

import java.util.Scanner;

/**
 * Created on 28.12.2018.
 */
public class Rectangle extends Shape{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
        a = 0;
        b = 0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("Enter size a: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter size b: ");
        b = sc.nextInt();
        draw(a,b);
    }
    public void draw(int a, int b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
