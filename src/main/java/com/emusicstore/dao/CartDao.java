package com.emusicstore.dao;

import com.emusicstore.model.Cart;

/**
 * Created by RAHUL on 8/6/2016.
 */
public interface CartDao {
    Cart getCartById(int cartId);

    void update(Cart cart);
}