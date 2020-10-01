/*
 * copyright held by Ocelot Media LLC, 2017
 * all rights reserved by Ocelot Media, LLC 2017
 */
package computepentagon;

import java.util.Scanner;

/**
 *
 * @author Rory Stouder
 *  SDEV 200 program exercises 4.1
 */
public class ComputePentagon {
    public static void main(String[] args) {
        final double PI = 3.14159; // Declare a constant PI
        
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter r
        System.out.print("Enter the length from center to vertex: ");
        double r = input.nextDouble();
        
        // find the length of a side from radius of pentagon.
        double s = 2 * r *Math.sin(Math.PI / 5);
        
        
        // Calculate the area based on formula
        double area = (5 * Math.pow(s, 2)) / (4.0 * Math.tan(Math.PI / 5));
        //Print result
        System.out.println (" Area of regular pentagon is " + 
                (double)Math.round(area * 100) / 100.0);
        
                
    }
    
}
