package ProgramDesign;/*
Design an algorithm that will prompt the user for the numerical value of two cards.
The program will receive the two numbers and display their sum on the screen. If the calculated sum is 21,
an asterisk is to be displayed beside the sum.

The program shall end when two zeros are entered.The program shall print a welcome message when it
is first started and an goodbye message when it terminates.
(//It's not clear to me why anyone would enter two zeros.)

Bonus:
Modify the algorithm to allow the user to enter the face cards as J,Q,K or A. If the user enters J, Q, or K
then convert the entered value to 10. If the user enters A then count the value as 11 points.
(//the value will never be 21, unless the user can enter more than two cards.)

Bonus Bonus:
Modify the algorithm to allow the user who receives the A to designate it either s 1 or 11.
(//Only makes sense if we incorporate random generator.)

Objective
Define the problem by constructing an algorithm using pseudocode
What control structures (sequence, selection and repetition) are required?
What variables are required?
Show a check of your solution with test data for at least two valid test cases

 */


import java.util.Scanner;

public class CardGame {

    public static void main(String args[]) {

        //Initialize known values
        char A = 10;
        char J = 10;
        char Q = 10;
        char K = 10;
        int win = 21;
        boolean again = false;

        //Display welcome message
        System.out.println("Welcome to Card Sharks! Let's begin...");

        do {
        //Prompt user for the value of two cards
        System.out.println("Please enter your first card value:");
        Scanner scanner = new Scanner(System.in);
        int card1 = scanner.nextInt();

        System.out.println("Please enter your second card value:");
        int card2 = scanner.nextInt();

        //Get sum of card values
        int cardSum = card1 + card2;

        //Display card values
        if(cardSum == win ) {
            System.out.println("*The sum is " + cardSum + ".");
        }
        else if(cardSum < win){
            System.out.println("The sum is " + cardSum + ".");
        }

        //Ask if user would like to continue

        System.out.println("Would you like to play? Enter true or false.");
        again = scanner.nextBoolean();

    } while(again);

        //Display goodbye message
        System.out.println("Thanks for playing. Goodbye.");



    }


}
