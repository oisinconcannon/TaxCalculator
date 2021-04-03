package ie.gmit;

import java.util.Scanner;

public class TaxMan {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        int selection;
        boolean exit = false;
        System.out.println("Welcome to your tax calculator\n");
        while(!exit)
        {
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
                    BusinessTax businessTax = new BusinessTax(0,0,0,0,0,0,0,
                            0,0,0,0);

                    double businessVatPercent = 23;
                    double businessTaxPercent = 12.5;

                    System.out.println("Please enter the amount of salaries paid");
                    businessTax.setSalariesPaid(scanner.nextDouble());

                    System.out.println("Please enter the amount of rent paid");
                    businessTax.setRentPaid(scanner.nextDouble());

                    System.out.println("Please enter the amount of cost of sale, ie. cost of production etc");
                    businessTax.setCostOfSales(scanner.nextDouble());

                    System.out.println("Please enter the amount of marketing expenses");
                    businessTax.setRentPaid(scanner.nextDouble());

                    System.out.println("Please enter the amount of accounting and legal fees");
                    businessTax.setAccountingLegalFees(scanner.nextDouble());

                    System.out.println("Please enter the amount of any other general expenses not accounted for, ie travel etc");
                    businessTax.setGeneralExpense(scanner.nextDouble());

                    System.out.println("Please enter the amount made from gross sales");
                    businessTax.setGrossSales(scanner.nextDouble());

                    System.out.println("Please enter the amount made from gross services");
                    businessTax.setGrossServices(scanner.nextDouble());

                    double revenue = businessTax.getGrossSales() + businessTax.getGrossServices();
                    double operatingExpense = businessTax.getSalariesPaid() + businessTax.getRentPaid() + businessTax.getCostOfSales()
                            + businessTax.getMarketingExpense() + businessTax.getUtilitiesPaid() + businessTax.getGeneralExpense()
                            + businessTax.getAccountingLegalFees();

                    businessTax.setRevenue(revenue);
                    businessTax.setOperatingExpense(operatingExpense);

                    double netIncome = businessTax.getRevenue() - businessTax.getOperatingExpense();
                    if(netIncome <= 0)
                    {
                        System.out.println("Your total profit was €" + netIncome);
                        System.out.println("No Taxes are Due\n");
                    }

                    else
                    {
                        double taxVat = netIncome * (businessVatPercent / 100);
                        double taxCorp = netIncome * (businessTaxPercent / 100);
                        double profitAfterTax = netIncome - (taxCorp + taxVat);
                        double taxToPay = taxCorp + taxVat;
                        System.out.println("Your total revenue is €" + businessTax.getRevenue());
                        System.out.println("Your total operating expense is €" + businessTax.getOperatingExpense());
                        System.out.println("Your total profit is €" + netIncome);
                        System.out.println("Taxes to be paid is €" + taxToPay);
                        System.out.println("Your total profit after vat and corporation tax is €" + profitAfterTax + "\n");
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
