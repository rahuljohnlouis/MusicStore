package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RAHUL on 7/21/2016.
 */
public class ProductDao {

    private List<Product> productList= new ArrayList<Product>();

    public List<Product> getProductList()
    {
        Product product = new Product();

        product.setProductName("Guitar");
        product.setProductCategory("Instrument");
        product.setProductDescription("This is a fender strat guitar");
        product.setProductPrice(1200);
        product.setProductCondition("New");
        product.setProductStatus("Active");
        product.setUnitStock(11);
        product.setProductManufacturer("Fender");

        productList.add(product);

        return productList;
    }

}
