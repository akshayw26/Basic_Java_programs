package com.BasicJavaPrograms;

import java.util.*;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        LargestOfThreeNumbers l1 = new LargestOfThreeNumbers();
        l1.largestNum();

    }
       private void largestNum(){

            Scanner sc =new Scanner(System.in);
                System.out.println("Enter 1st number :");
              int a = sc.nextInt();
                System.out.println("Enter 2nd number :");
              int b = sc.nextInt();
                System.out.println("Enter 3rd number :");
              int c = sc.nextInt();

                if ( a > b && a > c ){
                    System.out.println("Largest number is -->"+ a);
                }else if ( b > a && b > c ){
                    System.out.println("Largest number is -->"+ b);
                }else if ( c > a && c > b ){
                    System.out.println("Largest number is -->"+ c);
                }else{
                    System.out.println("Cannot validate");
                }
    }
}