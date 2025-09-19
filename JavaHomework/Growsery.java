import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Growsery {
    
    public static double calculateTotal(int[] quantities, int[] prices) {
        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            total += quantities[i] * prices[i];
        }

        
        if (total > 500) {
            total = total - (total * 0.10);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
        int[] prices = {50, 40, 100, 25, 30};
        int[] quantities = new int[items.length];

        System.out.println("Welcome to the Grocery Store!");
        System.out.println("Available Items and Prices (per unit):");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - ₹" + prices[i]);
        }

        
        for (int i = 0; i < items.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter quantity for " + items[i] + ": ");
                    quantities[i] = Integer.parseInt(sc.nextLine());
                    if (quantities[i] < 0) {
                        System.out.println("Quantity cannot be negative. Try again.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number.");
                }
            }
        }

        
        double finalAmount = calculateTotal(quantities, prices);

        System.out.println("\n----- Bill Summary -----");
        double totalBeforeDiscount = 0;
        for (int i = 0; i < items.length; i++) {
            double itemTotal = quantities[i] * prices[i];
            if (quantities[i] > 0) {
                System.out.println(items[i] + " x " + quantities[i] + " = ₹" + itemTotal);
            }
            totalBeforeDiscount += itemTotal;
        }

        System.out.println("Total (before discount): ₹" + totalBeforeDiscount);

        if (totalBeforeDiscount > 500) {
            System.out.println("Discount Applied: 10%");
        }

        System.out.println("Final Amount to Pay: ₹" + finalAmount);

        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Purchase Date & Time: " + now.format(formatter));

        sc.close();
    }
}