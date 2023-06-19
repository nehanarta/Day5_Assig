package com.bridglabz;

public class Quadratic {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        double root1 = 0;
        double root2 = 0;
        double delta = b * b - 4 * a * c;
        System.out.println(delta);
        if (delta > 0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Roots are --> " + root1 + " and " + root2);
        } else if (delta == 0) {
            root1 = -b / (2.0 * a);
            System.out.println("The root is " + root1);
        } else {
            System.out.println("Roots are not real/imaginary");
        }
    }
}
