package com.emusicstore.service;

import com.emusicstore.model.CustomerOrder;

/**
 * Created by RAHUL on 8/16/2016.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
