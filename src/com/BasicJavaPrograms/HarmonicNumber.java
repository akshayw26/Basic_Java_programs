package com.BasicJavaPrograms;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {

     HarmonicNumber h1 = new HarmonicNumber();

     h1.harmonicNumber();

    }

   public void harmonicNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        double sum = 0;

        //Condition check
        if (n > 0) {
            for (double i = 1; i <= n; i++) {
                sum += (1 / i);
                System.out.print(sum+ " ");
             }
           } else {
            System.out.println("INVALID USER INPUT");
        }
    }
}
