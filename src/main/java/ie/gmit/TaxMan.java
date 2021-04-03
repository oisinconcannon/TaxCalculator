package ie.gmit;

import java.util.Scanner;

public class TaxMan {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        int selection;
        boolean exit = false;
        while(!exit)
        {
            System.out.println("Welcome to your tax calculator\n");
            System.out.println("MENU:");
            System.out.println("Select 1 For Salary Tax Calculation");
            System.out.println("Select 2 For Business Tax Calculation");
            System.out.println("Select 3 For Loan Calculator");
            selection = scanner.nextInt();
            switch(selection)
            {
                case 1 :
                    break;

                case 2:
                    BusinessTax businessTax = new BusinessTax(0,0);
                    double businessTaxPercent = 12.5;
                    System.out.println("Please Enter your operating Expense");
                    Double operatingExpense = scanner.nextDouble();  // Read user input
                    System.out.println("You have entered €" + operatingExpense + " for your operating expense\n");
                    System.out.println("Please Enter your Revenue");
                    Double revenue = scanner.nextDouble();  // Read user input
                    System.out.println("You have entered €" + revenue + " for your revenue\n");
                    businessTax.setOperatingExpense(operatingExpense);
                    businessTax.setRevenue(revenue);
                    double netIncome = businessTax.getRevenue() - businessTax.getOperatingExpense();
                    if(netIncome <= 0)
                    {
                        System.out.println("Your total profit was €" + netIncome);
                        System.out.println("No Taxes are Due\n");
                    }

                    else
                    {
                        double taxToPay = netIncome * (businessTaxPercent / 100);
                        System.out.println("Your total profit was €" + netIncome);
                        System.out.println("Taxes to be paid are on your total profit of €" + netIncome+ " at 12.5% is €" + taxToPay + "\n");
                    }
                    System.out.println("Do you want to continue? Type Yes / No");
                    Scanner scanner1 = new Scanner(System.in);
                    if (scanner1.next().equalsIgnoreCase("no"))
                        exit = true;
                    break;

                case 3 :
                    break;
            }
        }
    }
}
