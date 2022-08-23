package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");

        try {
            Double radius = input.nextDouble();
            while(radius <0){
                System.err.println("You entered a negative number! Please enter a number greater than 0");
                radius = input.nextDouble();
            }
            System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));

        }
        catch(Exception error) {
            System.err.println("You didn't enter a number!");
        }
        input.close();
    }
}
