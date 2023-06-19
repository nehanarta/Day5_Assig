package com.bridglabz;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int Number = sc.nextInt();
        if (Number % 2 == 0) {
            System.out.println("is even number");
        } else {
            System.out.println("is not odd number");
        }
    }
}


