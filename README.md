# JavaProgramDesign

Program Design, Pseudocode and Algorithms Exercies

FIND THE AVERAGE SCOREBEGINPROMPT user for exam score one.PROMPT  user for exam score two.PROMPT  user for exam score three.PROMPT  user for exam score four.PROMPT  user for exam score five.PROMPT  user for exam score six.PROMPT  user for exam score seven.PROMPT  user for exam score eightPROMPT  user for exam score nine.PROMPT  user for exam score ten.CALCULATE the sum of ten scores.scoreSum=score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10PRINT sum of the score.CALCULATE the average of the scores. scoreAverage = scoreSum/numberOfScoresPRINT scoreAverageENDHOW MUCH WATER RUNS OFF THE ROOF?BEGININITIALIZE  known values.one foot = 12 inchesone gallon = 231 cubic feet of waterPROMPT  user to enter roof dimensions in feet.CONVERT roof dimensions to inches.roofInches = numberOfFeet * 12PROMPT user to enter amount of rainfall in inches.CALCULATE runoff in cubic inches of water.runoff = roofInches * cubicRainfall.CALCULATE runoff in gallons. gallonsRunoff = cubicRainfall/231 PRINT runoff in gallonsENDPROCESS CUSTOMER RECORDBEGINPROMPT user for customer name.PROMPT user for customer purchase amount. PROMPT  user for tax code.CALCULATE sales tax based on tax code.0 taxExempt = .0;1 state = .03;2 double federalState = .05;3 double special = .07;salesTax = purchaseAmount * taxRateCALCULATE total amount due.totalDue = purchaseAmount + salesTaxPRINT customer name.PRINT purchase amount.PRINT sales tax. PRINT total amount due. ENDCALCULATE EMPLOYEE PAYBEGINPROMPT user for employee number.PROMPT user for number of hours worked that week.PROMPT user for hourly rate.VALIDATE the hourly rate doesn't exceed maximum rate of $25.VALIDATE number of hours doesn't exceed maximum of 60 hours per week.PRINT error message if input is invalid.CALCULATE employee weekly salary hours worked up to 35 at hourly rate.employeeSalary = hoursWorked * hourlyRateCALCULATE employee weekly salary for hours worked over 35 time and half. (overtime)overtimeRate = hourlyRate + hourlyRate * .50CALCULATE overtimeHoursovertimeHours = hoursWorked = standardHoursCALCULATE overtime payovertimePay = overtimeHours * overtimeRatePRINT weekly pay for each employee. ENDHOW MUCH SHOULD A FENCE COST?BEGINPROMPT user what type of fence they would like.PRINT cost of wood fence per square foot.PRINT cost of chain fence per square foot.PROMPT user for square footage of yard. CALCULATE wooden fence cost.woodFenceCost = $25 * squareFootagePRINT estimate.CALCULATE chain fence cost.chainFenceCost = $15 * squareFootagePRINT estimate.DISPLAY message advising customer cost of gates @$150 each.DISPLAY message advising customer there is a minimum of one gate and maximum of three gates.PROMPT user to input number of gates.VALIDATE number of gates entered to be greater than 1 and less than 4.DISPLAY error message if gate number is invalid.CALCULATE gate cost.gateCost = numberOfGates * 150 PRINT gate costs.DISPLAY message advising  sales tax of 6 percent on materials.CALCULATE tax on fence.DISPLAY cost of building permit, $50. PRINT estimate of wood fence with tax.PRINT estimate of chain fence with tax.END

  
METRIC CONVERSION

BEGIN
Ask user for each fifteen measurements in inches one at a time..
Convert each measurement to millimeters.
Display each measurement in millimeters.
Display record of all measurements.
Print message, "All measurements processed."  
END
  
ELECTRICITY USAGE
  
BEGIN
Ask user for customer number, customer name and usage in kilowatt hours.
Calculate amount customer owes for usage of up to 200 hours at standard rate.
Calculate amount owws for usage over 200 hours at discounted rate
Calculate amount customer owes.
Display how much customer owes.
Print report of customer usage.
Display total electricity used by customers. 
END
 
CARD GAME

BEGIN
Welcome user to game.
Ask user to enter first value of card.
Ask user to enter second value of card.
End program if user enters two zeros.
Calculate sum of cards
Display sum of cards.
If card value is 21 display sum and message, "You Win."
If card vlue is not 21 display sum of cards.
Ask if user would like to continue. 
Display goodbye message.
END 

Card game algorithm:
cardSum = card1 + card2
