package com.BasicJavaPrograms;

import java.util.Scanner;

public class FLipCoin {

    public static void main(String[] args) {

        FLipCoin f1 = new FLipCoin();
         f1.flipCoin();
    }

    void flipCoin(){

        Scanner sc = new Scanner(System.in);
        System.out.print("How many times coin flips : ");
        int num = sc.nextInt();

        int head = 0;
        int tail = 0;

        double flipCoin = Math.floor(Math.random()*10)%2;

        for (int i = 0; i < num ; i++) {

            if(flipCoin == 0.5){
                head++;
            }else{
                tail++;
            }
        }

        int headPercentage = (head*100)/num;
        int tailPercentage = (tail*100)/num;
        System.out.println("Percentage of Head : " +headPercentage);
        System.out.println("Percentage of Tail : " +tailPercentage );
        System.out.println("head : " +head);
        System.out.println("tail : " +tail);
    }
}
