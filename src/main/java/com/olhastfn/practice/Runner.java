package com.olhastfn.practice;

import java.util.Scanner;

/**
 * Created on 28.12.2018.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("Which shape you want to draw? 1-Square 2-Rectangle 3-Triangle 0-Exit");
        Scanner in = new Scanner(System.in);
        int temp = -1;
        do {
            System.out.print("Enter your choice: ");
            temp = in.nextInt();
            if (temp == 1) {
                Square square = new Square();
                square.draw();
                break;
            } else if (temp == 2) {
                Rectangle rectangle = new Rectangle();
                rectangle.draw();
                break;
            }else if(temp==3){
                Triangle triangle = new Triangle();
                triangle.draw();
            }

        } while (temp != 0);
    }
}
