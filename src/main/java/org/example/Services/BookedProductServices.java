package org.example.Services;

import java.util.*;
import java.util.stream.Collectors;

import org.example.Exception.OutOfStockException;
import org.example.Model.*;

public class BookedProductServices {

    private List<CartItem> cart = new ArrayList<>();
    private Map<Product, Integer> inventory = new HashMap<>();
    private Stack<CartItem> undoStack = new Stack<>();
    private Set<String> customerIds = new HashSet<>();

    // Add inventory
    public void addInventory(Product product, int qty) {
        inventory.put(product, qty);
    }

    // Add to cart
    public void addToCart(Product product, int qty)
            throws OutOfStockException {

        int available = inventory.getOrDefault(product, 0);

        if (available < qty) {
            throw new OutOfStockException("Product out of stock");
        }

        // upadate the map
        inventory.put(product, available - qty);

        CartItem item = cart.stream()
                .filter(c -> c.getProduct().equals(product))
                .findFirst()
                .orElse(null);

        if (item == null) {
            item = new CartItem(product, qty);
            cart.add(item);
        } else {
            item.increaseQuantity(qty);
        }

        undoStack.push(item);
    }

    // Undo last add
    public void undoLastAdd() {
        if (!undoStack.isEmpty()) {
            CartItem item = undoStack.pop();

            inventory.put(
                    item.getProduct(),
                    inventory.get(item.getProduct()) + 1
            );

            // reduce quantity
            item.increaseQuantity(-1);

            if (item.getQuantity() <= 0) {
                cart.remove(item);
            }
        }
    }

    // Place order
//    successfully placing order
    public BookedProduct<Product> placeOrder(String customerId) {
        customerIds.add(customerId);
        return new BookedProduct<>(
//                generatae random customer id
                UUID.randomUUID().toString(),
                customerId,
                new ArrayList<>(cart)
        );
    }

    // Stream usage

}