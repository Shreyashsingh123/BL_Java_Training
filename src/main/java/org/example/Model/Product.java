package org.example.Model;

import java.util.Objects;

public class Product {
    private String productId;
    private String productName;
    private CategorieType category;
    private double price;
    private boolean discount;
    public Product(String productId, String productName, CategorieType category, double price, boolean di){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
        this.category=category;
        this.discount=di;
    }

    public String getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public CategorieType getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    public boolean getDiscount(){
        return discount;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }


}