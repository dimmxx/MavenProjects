package controller;

import model.Cart;
import model.Product;

public class CartController {

    private Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    public void addProduct(Product product){
        cart.getProductList().add(product);


    }


    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }


}
