package com.BasicJavaPrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
          LeapYear lY = new LeapYear();
          lY.leapYear();
    }

    void leapYear(){

        //Scanner class for User Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");

        int year= sc.nextInt();

        //condition to check whether it is leap or not
        if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)){
            System.out.println( year+ " : This is a Leap Year.");

        }else{
            System.out.println(year+ " : This is Not a Leap Year.");
        }

    }
}
