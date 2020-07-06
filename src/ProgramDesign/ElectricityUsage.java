/*
An electricity supply authority records on an electricity usage file the amount of electricity that each customer uses.

This file consists of:

a header record (first record), which provides the total kilowatt hours used during the month by all customers
a number of detail records, each containing the customer number, customer name and electricity usage (in kilowatt hours) for the month.
Design a solution algorithm that will read the electricity usage file and produce an electricity usage report showing the customer number,
customer name, electricity usage and the amount owing. The amount owing is calculated at 11 cents for each kilowatt hour used, up to 200 hours,
and 8 cents for each kilowatt hour used over 200 hours.

The report should also display the total electricity usage in kilowatt hours.
 */


package ProgramDesign;

import java.util.Scanner;

public class ElectricityUsage {
    public static void main(String args[]){


        //Initialize known values
        double stdRate = .11;
        double reduRate = .08;
        double stdUsage = 200;
        boolean again = false;

        do {

            //Get customer number, customer name and usage in killowatt hours
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter customer number:");
            int customerNumber = scanner.nextInt();

            System.out.println("Please enter customer name:");
            String customerName = scanner.next();

            System.out.println("Please enter number of kilowatts used:");
            double custUsage = scanner.nextDouble();

            //Calculate amount customer owes
            double amountOwed = stdRate * custUsage;

            //Calculate reduced rate
            double moreUsage = custUsage - stdUsage;
            // double reduRate = moreUsage * .08;

            //

            if (custUsage <= stdUsage) {
                amountOwed = stdRate * custUsage;
            } else if (custUsage > stdUsage) {
                amountOwed = (stdRate * stdUsage) + (moreUsage * reduRate);
            }
            System.out.println("The customer owes " + amountOwed + " this month.");


            System.out.println("---------------------------------------------------");

            //Display total electricity usage in kilowatt hours
            double totalUsage = custUsage + 0;
            System.out.println("The total electricty usage for this customer is " + totalUsage + " kilowatt hours.");

            System.out.println("Do you have another entry? Enter true or false.");
            again = scanner.nextBoolean();

        } while(again);




    }



}
