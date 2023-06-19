package com.bridglabz;

public class Distance {
    public static void main(String[] args) {
        int x1=0,x2=3;
        int y1=0,y2=9;
        int distance;
        int x=(x2-x1);
        System.out.println("x====>"+x);
        int y=(y2-y1);
        System.out.println("y====>"+y);
        distance=(int)Math.sqrt((x*x)+(y*y));
        System.out.println(distance);
        }
    }

