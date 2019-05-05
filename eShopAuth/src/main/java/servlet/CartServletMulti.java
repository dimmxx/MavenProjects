package servlet;

import controller.CartController;
import controller.DbWorker;
import controller.ProductController;
import model.Cart;
import model.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CartServletMulti extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cart cart = null;
        //int productId = Integer.valueOf(req.getParameter("productId"));
        //int quantity = Integer.valueOf(req.getParameter("quantity"));

        String productId = req.getParameter("productId");
        String quantity = req.getParameter("quantity");

        HttpSession session = req.getSession();
        if (session.getAttribute("cart") == null){
            cart = new Cart();
        }else {
            cart = (Cart)session.getAttribute("cart");
        }

        CartController cartController = new CartController(cart);

        if (productId != null && quantity != null) {
            DbWorker db = new DbWorker();
            ProductController productController = new ProductController(db);
            Product product = productController.getProduct(Integer.valueOf(productId));
            cartController.addProductToCartMap(product, Integer.valueOf(quantity));
            session.setAttribute("cart", cartController.getCart());
        }

    }
}