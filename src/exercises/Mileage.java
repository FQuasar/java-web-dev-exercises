package exercises;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many miles you have driven? ");
        Double miles = input.nextDouble();
        System.out.print("How many gallons you have consumed? ");
        Double gallons = input.nextDouble();
        System.out.println( miles/gallons +" miles per gallon" );
    }
}
