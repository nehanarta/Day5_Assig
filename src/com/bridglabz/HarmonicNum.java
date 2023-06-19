package com.bridglabz;
import java.util.Scanner;
public class HarmonicNum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        double result=0.0;
        for(int i=number;i>0;i--){
            result=result+(double)1/i;
            System.out.print(result+",");

        }

    }
}
