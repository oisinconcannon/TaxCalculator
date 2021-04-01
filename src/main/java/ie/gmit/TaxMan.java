package ie.gmit;

public class TaxMan {

    public static void main(String[] args)
    {
        System.out.println("Welcome to your tax calculator\n\n");
        System.out.println("What tax would you like to calculate");
        SalaryTax s = new SalaryTax("oisin","abcd",123456,30000);
        s.setSalary(30000);
        System.out.println(s.getIncomeTax());
        System.out.println(s.getPrsi());
        System.out.println(s.getUsc());
        System.out.println(s.getGrossSalary());
        //tesiting
        // testing new branch latif
        //
    }
}
