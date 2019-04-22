package controller;

import model.Cart;
import model.Product;

import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        DbWorkerSQLite db = new DbWorkerSQLite();

        ProductControllerSQLite productController = new ProductControllerSQLite(db);

        productController.createTable();


    }
}
