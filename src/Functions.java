import  java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the items ordered price: ");
        double ordered_price = input.nextDouble();

        System.out.println("Enter the tip amount: ");
        double tip = input.nextDouble();

        if (!ValidateAmounts(ordered_price, tip)) {
            System.out.println("Ordered price or tip shouldn't be less than 0.");
            System.exit(0);
        }

        double tax_amount = GetTaxAmount(ordered_price);
        double total_amount = GetTotalAmount(ordered_price, tip, tax_amount);
        double share = 0.0;

        System.out.println("Do you want to split the bill?[yes/no]");
        String split_bill = input.next().toLowerCase();

        if (split_bill.equals("yes")) {
            System.out.println("Enter the number of shares/partitions:");

            int shares = input.nextInt();
            share = SplitBillAmount(total_amount, shares);
        }

        PrintBill(ordered_price, tax_amount, tip, total_amount, share);
    }

    private static boolean ValidateAmounts(double ordered_price, double tip) {
        if (ordered_price < 0 || tip < 0) {
            return  false;
        }
        else {
            return true;
        }
    }

    private static  double GetTaxAmount(double ordered_price) {
        int tax_percentage = 18;
        double tax_amount = (ordered_price/100) * tax_percentage;

        return  tax_amount;
    }

    private static double GetTotalAmount(double ordered_price, double tip, double tax) {
        double total_amount = ordered_price + tip + tax;

        return total_amount;
    }

    private static double SplitBillAmount(double total_amount, int shares) {
        double share = total_amount/shares;

        return share;
    }

    private static void PrintBill(double ordered_price, double tax_amount, double tip, double total_amount, double share) {
        System.out.println("\t\t\tVamsi's Restaurant");
        System.out.println("Ordered Amount: " + ordered_price);
        System.out.println("Tax: " + tax_amount);
        System.out.println("Tip: " + tip);
        System.out.println("Total Amount: " + total_amount);

        if (share > 0) {
            System.out.println("Share: " + share);
        }
    }
}
