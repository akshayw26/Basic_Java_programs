package com.BasicJavaPrograms;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
         powerOf2();
    }

       static void powerOf2(){

        Scanner sc = new Scanner(System.in);
           System.out.println("Enter Number : ");
        int num = sc.nextInt();
           System.out.println("Enter Power : ");
        int power = sc.nextInt();

        int result = 1;

        for (int i = 0; i <= power; i++) {

               result = num * result; // 3*1= 3 //3*3 =9 //9*3 = 27
        }
        System.out.println("Power : "+result);

    }
}
