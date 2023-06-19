package com.bridglabz;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of times coins flips");
        int n=sc.nextInt();
        int tailCount=0;
        int headCount=0;
        for(int i=0;i<n;i++) {
            float coinValue = (float) (Math.random() * 10 % 1);
            System.out.println(coinValue);
            if (coinValue < 0.5) {
                tailCount++;
            } else {
                headCount++;
            }
        }
            System.out.println("tail"+tailCount);
            System.out.println("head"+headCount);


    }
}
