package controller;

public class Main {


    public static void main(String[] args) {


        DbWorker db = new DbWorker();

        ProductController productController = new ProductController(db);

        System.out.println(productController.getProducts());


    }



}
