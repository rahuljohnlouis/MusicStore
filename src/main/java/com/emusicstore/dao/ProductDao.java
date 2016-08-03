package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by RAHUL on 8/1/2016.
 */
public interface ProductDao {

    void addProduct(Product product);
    void editProduct(Product product);
    Product getProductId(String id);

    List<Product> getAllProducts();

    void deleteProduct(String id);

}
