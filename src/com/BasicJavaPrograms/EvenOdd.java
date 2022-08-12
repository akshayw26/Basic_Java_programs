package com.BasicJavaPrograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        EvenOdd e1 = new EvenOdd();
        e1.evenOdd();
    }

    public void evenOdd() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " --> Is Even number");
        } else {
            System.out.println(num + " --> Is Odd number");
        }
    }
}