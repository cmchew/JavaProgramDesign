package ProgramDesign;

/*

Objective: Write the pseudocode for following problems.
Remember, your algorithm should allow any other person to achieve the same result by following your steps. They should not have to think about what they are doing.
Define the problem by constructing an algorithm using pseudocode
What control structures (sequence, selection and repetition) are required?
What variables are required?
Show a check of your solution with test data for at least two valid test cases
1. Find the average score
A program is needed to prompt the user operator for ten exam scores, calculate the average score and display the result to the screen.
The average score is calculated as the sum of the scores divided by the number of scores.
 */

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {


        //Prompt user for exam scores
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter score one:");
        double score1 = scanner.nextDouble();
        System.out.println("Please enter score two:");
        double score2 = scanner.nextDouble();
        System.out.println("Please enter score three:");
        double score3 = scanner.nextDouble();
        System.out.println("Please enter score four:");
        double score4 = scanner.nextDouble();
        System.out.println("Please enter score five:");
        double score5 = scanner.nextDouble();
        System.out.println("Please enter score six:");
        double score6 = scanner.nextDouble();
        System.out.println("Please enter score seven:");
        double score7 = scanner.nextDouble();
        System.out.println("Please enter score eight:");
        double score8 = scanner.nextDouble();
        System.out.println("Please enter score nine:");
        double score9 = scanner.nextDouble();
        System.out.println("Please enter score ten:");
        double score10 = scanner.nextDouble();

        //Calculate scoreSum
        double scoreSum = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;
        System.out.println("The total of all ten scores is " + scoreSum + ".");

        //Calculate scoreAverage
        double scoreNumber = 10;
        double scoreAverage = scoreSum/scoreNumber;

        //Display scoreAverage
        System.out.println("The average of all ten test scores is " + scoreAverage + ".");


    }


}
