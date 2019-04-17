package controller;

import model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductController {

    DbWorker db;
    private final static String GET_PRODUCTS_ALL = "SELECT * FROM products";


    public ProductController(DbWorker db) {
        this.db = db;
    }

    public List<Product> getProducts(){

        Statement st = db.getStatement();

        List<Product> products = new ArrayList<>();

        try {
            ResultSet rs = rs = st.executeQuery(GET_PRODUCTS_ALL);
            while (rs.next()){
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setProductName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getInt("price"));
                product.setCategory(rs.getInt("category"));
                products.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }
}
