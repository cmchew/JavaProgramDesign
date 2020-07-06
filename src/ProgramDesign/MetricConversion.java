/*
DOWHILE
1.Receive 15 measurements (DOWHILE)
Every day, a researcher receives 15 measurements. He needs a program written that will
accept each measurement and convert it to its metric equivalent (from inches to millimeters).
The result shall display on the monitor. After all 15 measurements are entered, the words
"All measurements processed" shall be displayed on the screen.

1 inch = 2.54 mm

2. Read 15 measurements (WHILE)
3. Read 15 measurements (Counted repetition)

 */


package ProgramDesign;
import java.util.Scanner;

public class MetricConversion {
    public static void main(String args[]) {

        //Initialize known values
        boolean again = false;
        double metric = 25.4;


        do {
            //Get measurements in inches
            System.out.println("Please enter your measurement in inches:");
            Scanner scanner = new Scanner(System.in);
            double measurement = scanner.nextDouble();

            //Display conversion
            double conversion = measurement * metric;
            System.out.println("The metric equivalent for " + measurement + " inches is " + conversion + " millimeters.");


            System.out.println("All measurements processed.");

            //Ask user to continue
            System.out.println("Would you like to continue? Enter true or false:");
            again = scanner.nextBoolean();
        } while (again);

        //System.out.println("All measurements processed.");

    }

}