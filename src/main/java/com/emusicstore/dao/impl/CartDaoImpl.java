package com.emusicstore.dao.impl;

import com.emusicstore.dao.CartDao;
import com.emusicstore.model.Cart;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RAHUL on 8/6/2016.
 */
public class CartDaoImpl implements CartDao {

    private Map<String,Cart> listOfCarts;

    public CartDaoImpl()
    {
        listOfCarts= new HashMap<String, Cart>();
    }
    public Cart create(Cart cart) {
        if(listOfCarts.keySet().contains(cart.getCartId()))
        {
            throw new IllegalArgumentException(String.format("Cannot create a cart. A cart with given ID(%) already exists.",cart.getCartId()));
        }
        listOfCarts.put(cart.getCartId(),cart);

        return cart;
    }

    public Cart read(String cartId) {
        return listOfCarts.get(cartId);
    }

    public void update(String cartId, Cart cart) {
        if (!listOfCarts.keySet().contains(cartId))
        {
            throw new IllegalArgumentException(String.format("Cannot create a cart. Cart with given ID(%) does not exists.",cart.getCartId()));
        }
        listOfCarts.put(cartId,cart);
    }

    public void delete(String cartId) {
        if (!listOfCarts.keySet().contains(cartId))
        {
            throw new IllegalArgumentException(String.format("Cannot delete cart. Cart with given ID(%) does not exists.",cartId));
        }
        listOfCarts.remove(cartId);
    }
}
