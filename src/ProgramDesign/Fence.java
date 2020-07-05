package ProgramDesign;

/*

5. How much should a fence cost?

You've just been hired by Alton's Hardware Store.
Your job is to develop a tool which will allow his customers to calculate the cost for installing a fence.
Start by determining the algorithm to calculate the cost of installing the fence.

Create a program that will calculate the cost with tax of fencing a rectangular yard.
The cost of the fencing will depend on the amount of fencing required (the perimeter of the yard),
and the type of fencing used. Gates can are available for an additional cost.At least one gate is required.

Prices (including installation)
Wooden fencing costs $25 per foot
Chain-link fencing costs $15 per foot
Gates cost $150 each. You must install at least one gate and can install up to 3
A building permit is required. It costs $50.00.
The tax rate is 6.0% but it doesn't apply to the building permit
 */
import java.util.Scanner;
public class Fence {
    public static void main(String args[]){

        //Initialize known values
        int fenceWooden = 25;
        int fenceChain = 15;
        int fenceGate = 150;
        int fencePermit = 50;
        double fenceTaxRate = .06;

        Scanner scanner = new Scanner(System.in);

        //Get unknown values
        System.out.println("What type of fence would you like?:");
        String fence = scanner.next();

        String message;

        switch(fence){
            case "wooden": //alterate ways to say wooden, i.e. "wood" "Wood" "Wooden"
                message = "A wooden fence is $25 per square foot.";
                break;
            case "chain"://alternate ways to say chain, i.e. "chain" "Wood" "Wooden"
                message = "A chain fence is $15 per square foot.";
                break;
            default:
                message = "Error. Invalid response.";
        }

        System.out.println(message);
        //Get square yard square footage
        System.out.println("Please enter the square footage of your yard.");
        int fenceFootage = scanner.nextInt();

        //Calculate wooden fence cost and print
        double fenceWoodFencing = fenceWooden * fenceFootage;
        System.out.println("The cost for your wood fencing is $" + fenceWoodFencing + ".");

        //Calculate chain fence cost and print
        double fenceChainFencing = fenceChain * fenceFootage;
        System.out.println("The cost for your chain fencing is $" + fenceChainFencing + ".");

        //Calculate gate cost and print
        System.out.println("Gates cost an addtional $150. The maximum number of gates we can install is three. Please enter the number of gates you would like:");
        int numberOfGates = scanner.nextInt();

        double fenceGateCost = fenceGate * numberOfGates;
        System.out.println("The cost for your gates is $" + fenceGateCost + ".");

        System.out.println("____________________________________________");

        //Calculate wood fence cost with tax
        double fenceWoodCost = fenceWoodFencing + fenceGateCost;
        double fenceWoodTax = fenceWoodCost * fenceTaxRate;
        double fenceWoodTotalCost = fenceWoodCost + fenceWoodTax;
        System.out.println("The total materials and labor for your wood fence with " + numberOfGates + " gates is $" + fenceWoodCost + ".");
        System.out.println("The tax will be $" + fenceWoodTax + ".");
        System.out.println ("The total cost with tax will be $" + fenceWoodTotalCost + ".");
        System.out.println("We also will need to purchase fence permit from the city at a fee of $" + fencePermit + ".");

        System.out.println("____________________________________________");

        //Calculate chain fence cost with tax
        double fenceChainCost = fenceChainFencing + fenceGateCost;
        double fenceChainTax = fenceChainCost * fenceTaxRate;
        double fenceChainTotalCost = fenceChainCost + fenceChainTax;
        System.out.println("The total materials and labor for your chain fence with " + numberOfGates + " gates is $" + fenceChainCost + ".");
        System.out.println("The tax will be $" + fenceChainTax + ".");
        System.out.println ("The total cost with tax will be $" + fenceChainTotalCost + ".");
        System.out.println("We also will need to purchase fence permit from the city at a fee of $" + fencePermit + ".");
            //double fenceTotalCost = fenceCost + fenceGate;
            //double fenceTax = fenceCost * fenceTaxRate;
            //double fenceTotal = fenceCost + fenceTax + fencePermit;

            //if (fenceType == wooden) {
              //  fenceCost = fenceWooden * fenceFootage;
            //} else if (fenceType == chain) {
                //fenceCost = fenceChain * fenceFootage;
            }

            //Display fence cost
            //System.out.println("The estimate for your new fence is " + fenceTotal + ". This includes the " + fenceGate + "S" + fenceFootage + "taxes of $" + fenceTax + "and the $" + fencePermit + "fee. Please let us know when you are ready to get started.");
    }





