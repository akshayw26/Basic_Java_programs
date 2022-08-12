package com.BasicJavaPrograms;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        swap();
    }

     static void swap(){

        int a = 10;
        int b = 20;
        System.out.println("before swap the numbers --> "+a+" "+b);

           int t = a;
               a = b;
               b = t;

          a = a+b; // 10+20-->30
          b = a-b; // 30-20-->10
          a = a-b; // 30-10-->20

        System.out.println("after swap the numbers --> "+a+" "+b);
    }
}
