package org.example.Model;
import java.util.*;


public class BookedProduct<T extends Product>{
    private String orderId;
    private String CustomerId;
    private List<CartItem>items;
    public BookedProduct(String orderid, String customerId, List<CartItem> item){
        this.CustomerId=customerId;
        this.orderId=orderid;
        this.items=item;
    }

    public double calculateTotal() {
        return items.stream()
                .mapToDouble(i ->
                        i.getProduct().getPrice() * i.getQuantity())
                .sum();
    }


}