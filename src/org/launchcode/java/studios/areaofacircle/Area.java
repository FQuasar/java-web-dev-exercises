package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double r = input.nextDouble();
        //double A = Math.PI * r * r;
        //System.out.println("The area of a circle of radius 2.5 is: "+A);

        double A = Circle.getArea(r);
        System.out.println("The area of a circle of radius 2.5 is: "+ A);
    }
}
