package org.example;
import java.util.*;
import org.example.Model.BookedProduct;
import org.example.Model.CategorieType;
import org.example.Model.Product;
import org.example.Services.BookedProductServices;
import org.example.Validation.Validation;
import org.example.Exception.OutOfStockException;
import org.w3c.dom.ls.LSOutput;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookedProductServices b = new BookedProductServices();
        Validation v = new Validation();

        // Adding item to map
        Product p1 = new Product("p1", "Laptop", CategorieType.ELECTRONICS, 50000.0, true);
        b.addInventory(p1, 10);

        // Get customer details
        System.out.print("Enter Name: ");
        String customerName = sc.nextLine();
        if (!v.isvalidname(customerName)) {
            System.out.println("Enter valid name");
            return;
        }

        System.out.print("Enter Email: ");
        String customerEmail = sc.nextLine();

        if (!v.isvalidemail(customerEmail)) {
            System.out.println("Enter valid email");
            return;
        }
        System.out.print("Enter Customer ID: ");
        String customerId = sc.nextLine();
        if (!v.isvalidid(customerId)) {
            System.out.println("Enter valid Id");
            return;
        }
        boolean shopping = true;

        while (shopping) {
            try {
                System.out.print("Enter quantity of Laptop to buy: ");
                int qty = sc.nextInt();

                b.addToCart(p1, qty);
                System.out.println("Successfully Added " + qty + " laptops to cart.");

            } catch (OutOfStockException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Continue Shopping? (yes/no): ");
            sc.nextLine();
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                shopping = false;
            }
        }

        // Place order
        BookedProduct<Product> order = b.placeOrder(customerId);
        System.out.println("\n Order Details are:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Email: " + customerEmail);
        System.out.println("Order Total: " + order.calculateTotal());

        // Coupon example (optional)
        System.out.print("Enter coupon code (if any): ");
        String coupon = sc.nextLine();
        if (v.isValidCoupon(coupon)) {
            System.out.println("Coupon Applied!");
            double total = order.calculateTotal() * 0.9; // give 10% discount
            System.out.println("Discounted Total: " + total);
        } else {
            System.out.println("No valid coupon applied.");
        }

        System.out.println("Thank you for shopping !");
    }
}
