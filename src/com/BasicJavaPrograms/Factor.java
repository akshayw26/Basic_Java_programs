package com.BasicJavaPrograms;

import java.util.Scanner;

public class Factor {

    public static void main(String[] args) {

        factor();
    }

    static void factor() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");

        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {

                count++;

                System.out.println(i + " ");

             }
            }if(count == 2){
                 System.out.println(num+ "-->Prime number");

            }else{
                     System.out.println(num+"-->Not Prime Number");
        }
    }
}

