package com.bridglabz;

import java.util.Scanner;

public class PowOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter the limit");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int temp=2;
        if(N>=1 && N<=31){
            for(int i=1;i<=N;i++){
                int result=(int)(Math.pow(temp,i));
                System.out.println(result);

            }
        }else{
                System.out.println("");

        }
    }
}

