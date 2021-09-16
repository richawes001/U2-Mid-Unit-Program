/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */

    // 1. Get inputs - Hourly Rate, Hours Worked, Sales Commission, and Total Sales
    // 2. Calculate money made from Hourly Rate * Hours Worked | Calculate money made from Sales Commission percentage from Total Sales
    // 3. Calculate Total Earnings from previous calculations added
    // 4. Display results (Total Earnings)

import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    public static void main(String[] args) {

        double hourRate = getInput("Please give your hourly rate.");
        double hourWork = getInput("Please give your hours worked.");

        double salesPercentage = getInput("Please give your sales commission percentage.");
        double totalSales = getInput("Please give your total sales.");

        double hoursMoney = hoursMoney(hourRate, hourWork);
        double salesMoney = salesMoney(salesPercentage, totalSales);

        double totalEarnings = hoursMoney + salesMoney;

        outputResults(totalEarnings);

        System.exit(0);

    }

    // Input Method

    public static double getInput(String message){

        return Double.parseDouble(JOptionPane.showInputDialog(message));

    }

    // Money made from Hourly Rate and Hours Worked Method

    public static double hoursMoney(double hourRate, double hourWork){

        return hourRate * hourWork;

    }

    // Money made from Sales Commission percentage from Total Sales

    public static double salesMoney(double salesPercentage, double totalSales){

        return totalSales * (salesPercentage/100.00);

    }

    // Output Method

    public static void outputResults(double totalEarnings){

        DecimalFormat round = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null, "Your total earnings is: " + round.format(totalEarnings));

    }

}
