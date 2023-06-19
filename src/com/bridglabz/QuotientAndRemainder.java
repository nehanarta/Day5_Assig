package com.bridglabz;
import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data");
        int data=sc.nextInt();
        System.out.println("Enter the divisor");
        int divisor=sc.nextInt();
        System.out.println("Data==>"+data);
        System.out.println("Divisor==>"+divisor);
        int reminder=(data%divisor);
        int Quotient=(data/divisor);
        System.out.println("Reminder===>"+reminder);
        System.out.println("Quotient===>"+Quotient);
        }

    }

