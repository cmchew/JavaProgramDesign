/*
4. Calculate employee's pay
A program is required by a company to read an employee’s number, pay rate and the number of hours worked in a week.
The program is then to validate the pay rate field and the hours worked field and,
if valid, compute the employee’s weekly pay and then print it and the input data.

Validation: According to the company’s rules, the maximum hours an employee can work per week is 60 hours,
and the maximum hourly rate is $25.00 per hour. If the hours worked field or the hourly rate field is out of range,
the input data and an appropriate message are to be printed and the employee’s weekly pay is not to be calculated.

Weekly pay calculation: Weekly pay is calculated as hours worked times pay rate.
If more than 35 hours are worked, payment for the overtime hours worked is calculated at time-and-a-half.

 */

package ProgramDesign;

import java.util.Scanner;

public class EmployeePay {
    public static void main(String args[]){

        //Initialize known values
        double maxHours = 60;
        double maxRate = 25;
        double hoursStandard = 35;
        double overtimeRate = 1.5;

        Scanner scanner = new Scanner(System.in);

        //Get employee number, pay rate and number of hours worked this week.
        System.out.println("Please enter your employee number:");
        int employeeNumber = scanner.nextInt();

        System.out.println("Please enter your hourly rate:");
        double hourlyRate = scanner.nextDouble();

        //Validate input
        while(hourlyRate > maxRate){
            System.out.println("Invalid Entry. The maximum hourly rate is $25. Please reenter.");
            hourlyRate = scanner.nextDouble();
        }

        System.out.println("Please enter number of hours worked this week:");
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > maxHours){
            System.out.println("Invalid Entry. The maximum number of hours per week is 60. Please reenter.");
            hoursWorked = scanner.nextDouble();
        }
        //scanner.close();

        //Calculate weekly pay
        double weeklyPay = hourlyRate * hoursWorked;
        //Calculate overtime pay
        double hoursOvertime = hoursWorked - hoursStandard;
        double overtimePay = hourlyRate * overtimeRate;
        //double totalPay = regularPay + overtimePay;

        if(hoursWorked <= hoursStandard){
            weeklyPay = hourlyRate * hoursStandard;
            System.out.println("Thank you for your hard work. You have " + hoursWorked + " . Your pay this week is: $" + weeklyPay + ".");
        }
        else if(hoursWorked > hoursStandard) {
            weeklyPay = (hourlyRate * hoursStandard) + (overtimePay * hoursOvertime);
            //totalPay = regularPay + overtimePay;//need help with this calculation

            System.out.println("Thank you for your hard work. You have " + hoursStandard + " regular hours and " + hoursOvertime + " overtime hours.");
            System.out.println("Your pay this week is: $" + weeklyPay + ".");
            //System.out.println("Your pay this week is: $" + weeklyPay + " and $" + overtimePay + ".");
        }


        //Calculate overtime pay
        //double overtime = maxHours - standardHours;





    }
}
