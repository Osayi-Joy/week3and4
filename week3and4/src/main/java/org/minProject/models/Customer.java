package org.minProject.models;
import org.minProject.base.User;

import java.util.HashMap;

public class Customer extends User {

    public Customer(String id, String name, String address, double walletBalance) {
        super(id, name, address, walletBalance);
    }

    public Customer() {
        super();
    }


    @Override
    public HashMap<String, Product> getCart() {
        return super.getCart();
    }
}
