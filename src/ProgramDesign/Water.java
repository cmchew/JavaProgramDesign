package ProgramDesign;

/*

2. How much water runs off the roof
How much water runs off a roof in a rain storm?

To calculate the runoff from any given rainfall:
Take the dimensions of the footprint of the roof and convert them to inches.
(So, a 50' x 20' roof is 600" x 240"). Multiply the roof dimensions by the number of inches of rainfall.
In this example, 600" x 240" x 1" = 144,000 cubic inches of water. Divide that result by 231 to get
the number of gallons (because 1 gallon = 231 cubic inches). (144,000/231 = 623.38).

 */

import java.util.Scanner;

public class Water {
    public static void main(String[] args) {

        //Initialize known values
        double gallon = 231;

        Scanner scanner = new Scanner(System.in);

        //Prompt user to enter roof dimensions
        System.out.println("Please enter the roof length in inches:");
        int length = scanner.nextInt();
        System.out.println("Please enter the roof width in inches:");
        int width = scanner.nextInt();
        System.out.println("Please enter the rainfall in inches:");
        double rainfall = scanner.nextDouble();

        //Multiply roof dimensions by number of inches of rainfall

        double water = length * width * rainfall;

        double runoff = water/gallon;

        //Display runoff
        System.out.println("During a rainstorm " + runoff + " gallons of water run off my roof for every inch of rainfall.");



    }
}
