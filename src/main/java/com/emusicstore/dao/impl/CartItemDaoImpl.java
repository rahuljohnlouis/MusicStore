package com.emusicstore.dao.impl;

import com.emusicstore.dao.CartItemDao;
import com.emusicstore.model.Cart;
import com.emusicstore.model.CartItem;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by RAHUL on 8/14/2016.
 */
@Repository
@Transactional
public class CartItemDaoImpl implements CartItemDao {

    @Autowired
    private SessionFactory sessionFactory;
    public void addCartItem(CartItem cartItem) {
        Session session=sessionFactory.getCurrentSession();
        //Finds cart item with primary key and update that object, if doens't find creates a new one.
        session.saveOrUpdate(cartItem);
        session.flush();
    }

    public void removeCartItem(CartItem cartItem) {
        Session session=sessionFactory.getCurrentSession();
        session.delete(cartItem);
        session.flush();
    }

    public void removeAllCartItems(Cart cart) {
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem cartItem: cartItems)
        {
            removeCartItem(cartItem);
        }

    }

    public CartItem getCartItemByProductId(int productId) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from CartItem where productId=?");
        query.setInteger(0,productId);
        session.flush();

        return (CartItem)query.uniqueResult();
    }
}
