package org.example.Model;

public class CartItem {
    private Product product;
    private int qunat;
    public CartItem(Product pro, int qun){
        this.product=pro;
        this.qunat=qun;
    }

    public Product getProduct(){
        return product;
    }

    public void increaseQuantity(int qty) {
        this.qunat+=qty;
    }

    public int getQuantity() {
        return qunat;
    }
}