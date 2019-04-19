package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> productList = new ArrayList<>();
    private  int size;

    public int getSize() {
        return productList.size();
    }

    public List<Product> getProductList() {
        return productList;
    }


}
