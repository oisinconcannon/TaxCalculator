package ie.gmit;

import java.util.Scanner;

public class TaxMan {

    int selection;
    public static void main(String[] args)
    {
        TaxMan t1 = new TaxMan(1);
        int selectionCase;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        boolean exit = false;
        System.out.println("Welcome to your tax calculator\n");
        while(!exit)
        {
            System.out.println("MENU:");
            System.out.println("Select 1 For Salary Tax Calculation");
            System.out.println("Select 2 For Business Tax Calculation");
            System.out.println("Select 3 For Loan Calculator");
            selectionCase = scanner.nextInt();
            t1.setSelection(selectionCase);
            switch(selectionCase)
            {
                case 1 :
                    SalaryTax salaryTax = new SalaryTax("abcd","abcd","abcd","abcd",123,22,20000);
                    System.out.println("Please enter your first name");
                    salaryTax.setFirstName(scanner.next());
                    System.out.println("Please enter your last name");
                    salaryTax.setLastName(scanner.next());
                    System.out.println("Please enter your Company");
                    salaryTax.setCompany(scanner.next());
                    System.out.println("Please enter your Department");
                    salaryTax.setDepartment(scanner.next());
                    System.out.println("Please enter your Employment ID");
                    salaryTax.setEmploymentNumber(scanner.nextInt());
                    System.out.println("Please enter your Age");
                    salaryTax.setAge(scanner.nextInt());
                    System.out.println("Please enter your Salary");
                    salaryTax.setSalary(scanner.nextDouble());
                    System.out.println("Income Tax: "+ salaryTax.getIncomeTax());
                    System.out.println("Higher rate income Tax: "+ salaryTax.getUpperIncomeTax());
                    System.out.println("PRSI Tax: "+ salaryTax.getPrsi());
                    System.out.println("USC Tax: "+ salaryTax.getUsc());
                    System.out.println("Gross Salary: "+ salaryTax.getGrossSalary());
                    System.out.println("Do you want to continue? Type Yes / No");
                    Scanner scanner2 = new Scanner(System.in);
                    if (scanner2.next().equalsIgnoreCase("no"))
                        exit = true;
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
                    int option;
                    BankLoan bankLoan = new BankLoan();
                    System.out.println("Welcome to the Bank Loan Calculator");
                    System.out.println("Please enter your first name:");
                    bankLoan.setfName(scanner.next());
                    System.out.println("Please enter your last name:");
                    bankLoan.setlName(scanner.next());
                    System.out.println("Press 1 to calculate Mortgage repayments, Press 2 for car loan repayments.");
                    option = scanner.nextInt();
                    if(option ==1)
                    {
                        double monthlyRepayments;
                        System.out.println("Mortgage calculator selected!");
                        System.out.println("Please enter the value of the mortgage you require:");
                        bankLoan.setLoanAmount(scanner.nextDouble());
                        System.out.println("Please enter the Loan Term (in years):");
                        bankLoan.setYearsOnLoan(scanner.nextInt());
                        System.out.println("Please enter The purchase Price of the Property:");
                        monthlyRepayments =  bankLoan.mortgageCalculator(scanner.nextDouble());
                        System.out.println(bankLoan.getfName() + " " + bankLoan.getlName() +
                                " Your Monthly repayments for a mortgage of " + bankLoan.getLoanAmount() +
                                " over " + bankLoan.getYearsOnLoan() + " Years is : €" + monthlyRepayments);
                        System.out.println("Do you want to continue? Type Yes / No");
                        if (scanner.next().equalsIgnoreCase("no"))
                            exit = true;


                    }
                    else if(option == 2)
                    {
                        double monthlyRepayments;
                        System.out.println("Car Loan calculator selected!");
                        System.out.println("Please enter the value of the Car Loan you require:");
                        bankLoan.setLoanAmount(scanner.nextDouble());
                        System.out.println("Please enter the Loan Term (in years):");
                        bankLoan.setYearsOnLoan(scanner.nextInt());
                        monthlyRepayments = bankLoan.carLoanCalculator();
                        System.out.println(bankLoan.getfName() + " " + bankLoan.getlName() +
                                " Your Monthly repayments for a Car Loan of " + bankLoan.getLoanAmount() +
                                " over " + bankLoan.getYearsOnLoan() + " Years is : €" + monthlyRepayments);
                        System.out.println("Do you want to continue? Type Yes / No");
                        if (scanner.next().equalsIgnoreCase("no"))
                            exit = true;
                    }
                    else
                    {
                        System.out.println("Invalid Option, You will be redirected to the Main Menu.");

                    }
                    break;
            }
        }

    }
    public TaxMan(int selection)
    {
        setSelection(selection);
    }
    public int getSelection()
    {
        return selection;
    }

    public void setSelection(int selection)
    {
        if(selection == 1 || selection == 2 || selection == 3)
        {
            this.selection = selection;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Selection, please select a value between 1 - 3");
        }
    }
}
