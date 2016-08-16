package com.emusicstore.service;

import com.emusicstore.model.Cart;

/**
 * Created by RAHUL on 8/12/2016.
 */
public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);

}
