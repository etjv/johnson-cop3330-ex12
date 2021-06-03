/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Edmund Johnson V
 */

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
Computing simple interest is a great way to quickly figure out whether an investment has value. It’s also a good way to get comfortable with explicitly coding the order of operations in your programs.

Create a program that computes simple interest. Prompt for the principal amount, the rate as a percentage, and the time, and display the amount accrued (principal + interest).

The formula for simple interest is A = P(1 + rt), where P is the principal amount, r is the annual rate of interest, t is the number of years the amount is invested, and A is the amount at the end of the investment.

Example Output
Enter the principal: 1500
Enter the rate of interest: 4.3
Enter the number of years: 4
After 4 years at 4.3%, the investment will be worth $1758.
Constraints
Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        float principal = getPrincipal();
        float interest = getInterest();
        float years = getYears();
        System.out.println(output(principal, interest, years));
    }

    private static float getPrincipal(){
        System.out.print("Enter the principal: ");
        String x = in.nextLine();
        return Float.parseFloat(x.replace(" ", ""));
    }

    private static float getInterest(){
        System.out.print("Enter the rate of interest: ");
        String x = in.nextLine();
        return Float.parseFloat(x.replace(" ", ""));
    }

    private static float getYears(){
        System.out.print("Enter the number of years: ");
        String x = in.nextLine();
        return Float.parseFloat(x.replace(" ", ""));
    }

    private static String output(float p, float i, float y){
        float total = p * (1 + ((i / 100) * y));
        BigDecimal d = new BigDecimal(Float.toString(total));
        DecimalFormat dc = new DecimalFormat("#.##");
        return "After " + dc.format(y) + " years at " + i + ", the investment will be worth $" + dc.format(total) + ".";
    }
}
