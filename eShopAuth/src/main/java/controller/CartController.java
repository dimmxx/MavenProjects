package controller;

import model.Cart;
import model.Product;

public class CartController {

    private Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    public void addProductToCartMap(Product product, int quantity){
        if(cart.getProductMap().containsKey(product)){
            cart.getProductMap().put(product, cart.getProductMap().get(product) + quantity);
            } else {
            cart.getProductMap().put(product, quantity);
        }

    }

    public Cart getCart() {
        return cart;
    }

}
