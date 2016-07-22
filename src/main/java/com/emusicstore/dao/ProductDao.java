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

        Product product1 = new Product();

        product1.setProductName("Record");
        product1.setProductCategory("Record");
        product1.setProductDescription("This is an awesome mix of 20th century!");
        product1.setProductPrice(25);
        product1.setProductCondition("New");
        product1.setProductStatus("Active");
        product1.setUnitStock(45);
        product1.setProductManufacturer("EMI");

        productList.add(product1);

        Product product2 = new Product();

        product2.setProductName("Speaker");
        product2.setProductCategory("Accessory");
        product2.setProductDescription("This is a Polk Shelf Speaker");
        product2.setProductPrice(355);
        product2.setProductCondition("New");
        product2.setProductStatus("Active");
        product2.setUnitStock(9);
        product2.setProductManufacturer("Polk");

        productList.add(product2);
        return productList;
    }

}
