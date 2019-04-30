package controller;

import model.Cart;
import model.Product;

public class CartController {

    private Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    public void addProductToCartMap(Product product){
        if(cart.getProductMap().containsKey(product)){
            cart.getProductMap().put(product, cart.getProductMap().get(product) + 1);
            } else {
            cart.getProductMap().put(product, 1);
        }

    }

    public Cart getCart() {
        return cart;
    }

}
