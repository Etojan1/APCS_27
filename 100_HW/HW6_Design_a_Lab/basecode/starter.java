/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.print("Enter your age:");
        int age = input.nextInt();
        System.out.print("Enter your budget:");
        double budget = input.nextDouble();
        double ticketPrice;
        if (age < 13) {
            ticketPrice = 8;
        } else if (age < 60) {
            ticketPrice = 12;
        } else {
            ticketPrice = 9;
        }
        System.out.print("How many tickets?");
        int tickets = input.nextInt();
        System.out.print("How many popcorns?");
        int popcorns = input.nextInt();
        System.out.print("How many drinks?");
        int drinks = input.nextInt();
        double subtotal = tickets * ticketPrice + popcorns * 5 + drinks * 3;
        double discount = 0;
        if (subtotal >= 40) {
            discount = subtotal * 0.10;
        }
        double afterDiscount = subtotal - discount;
        double tax = afterDiscount * 0.10;
        double total = afterDiscount + tax;

    System.out.println(" Movie Receipt");
    System.out.println("Customer: " + name);
    System.out.println("Subtotal: $" + subtotal);
    System.out.println("Discount: $" + discount);
    System.out.println("Tax: $" + tax);
    System.out.println("Total: $" + total);
    if (budget >= total) {
    System.out.println("Enjoy your movie");
    System.out.println("Money remaining: $" + (budget - total));
} else {
    System.out.println("You need $" + (total - budget) + " more.");
}

       
    }
}
