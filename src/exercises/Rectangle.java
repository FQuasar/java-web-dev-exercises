package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rectangle's length: ");
        double length = input.nextDouble();
        System.out.print("Enter the rectangle's width: ");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("Rectangle's area = "+ area );
    }
}
