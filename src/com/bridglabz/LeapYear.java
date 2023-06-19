package com.bridglabz;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        boolean flag;
        if(year%4==0) {
            if (year % 10 == 0) {
                if (year % 400 == 0) {
                    flag = true;
                }else {
                    flag = false;
                }

            }else {
                flag = true;
            }
        }else{
                    flag=false;
                }

        if(flag=false){
            System.out.println("is not a leap year");
            }else{
            System.out.println("is leap year");
        }

    }
}
