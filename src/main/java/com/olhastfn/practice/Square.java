package com.olhastfn.practice;


import java.util.Scanner;

/**
 * Created on 28.12.2018.
 */
public class Square {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public Square() {
        a = 0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void printSquare() {
        System.out.println("Enter size: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
