package controller;

import model.Cart;
import model.Product;

import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        DbWorkerSQLite db = new DbWorkerSQLite();

        ProductController productController = new ProductController(db);

        productController.createTable();


    }
}
