 package ProgramDesign;

/*

3. Process customer record

A program is required to read a customer’s name, a purchase amount and a tax code.
The tax code has been validated and will be one of the following:
    0  tax exempt (0%)
    1  state sales tax only (3%)
    2  federal and state sales tax (5%)
    3  special sales tax (7%)

The program must then compute the sales tax and the total amount due,
and print the customer’s name, purchase amount, sales tax and total amount due.
 */

import java.util.Scanner;

public class CustomerRecord {
    public static void main(String[] args) {

        //initialize known values
        double taxExempt = .0;
        double state = .03;
        double federalState = .05;
        double special = .07;

        //int taxExempt = 0;
        //int state = 1;
        //int federalState = 2;
        //int special = 3;


        Scanner scanner = new Scanner(System.in);

        //Prompt user for name, purchase amount and tax code
        System.out.println("Print customer name:");
        String name = scanner.next();
        System.out.println("Please enter purchase amount:");
        double purchaseAmount = scanner.nextDouble();
        System.out.println("Please enter tax code:");
        int taxCode = scanner.nextInt();

        //Calculate salesTax
        double salesTax = purchaseAmount * taxCode;

        if(taxCode == 0){
            salesTax = purchaseAmount * taxExempt;
        }
        else if(taxCode == 1 ){
            salesTax = purchaseAmount * state;
        }
        else if(taxCode == 2){
            salesTax = purchaseAmount * federalState;
        }
        else if(taxCode == 3){
            salesTax = purchaseAmount * special;
        }
        //int taxCode = taxExempt;

        //Calculate totalDue
        double totalDue = purchaseAmount + salesTax;

        //Display total amount due
        System.out.println("Thank you " + name + " for your purchase. " + "That will be a total of $" + purchaseAmount + " and $" + salesTax + " tax. Your total amount due is $" + totalDue + ".");

    }

}


