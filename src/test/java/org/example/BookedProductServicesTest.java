package org.example;

import org.example.Model.*;
import org.example.Services.*;
import org.example.Exception.OutOfStockException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookedProductServicesTest {

    @Test
    void testAddToCartSuccess() {
        BookedProductServices service = new BookedProductServices();
        Product p1 = new Product("p1", "Laptop", CategorieType.ELECTRONICS, 50000.0, true);
        service.addInventory(p1, 10);

        assertDoesNotThrow(() -> service.addToCart(p1, 5));

        BookedProduct<Product> order = service.placeOrder("CUST101");
        assertEquals(250000.0,order.calculateTotal());
    }

    @Test
    void testAddToCartOutOfStock() {
        BookedProductServices service = new BookedProductServices();
        Product p1 = new Product("p1", "Laptop", CategorieType.ELECTRONICS, 50000.0, true);
        service.addInventory(p1, 3);

        OutOfStockException exception = assertThrows(OutOfStockException.class,
                () -> service.addToCart(p1, 5));

        assertEquals("Product out of stock", exception.getMessage());
    }

}
