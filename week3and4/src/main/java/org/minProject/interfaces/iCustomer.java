package org.minProject.interfaces;


import org.minProject.models.Customer;
import org.minProject.models.Product;

import java.util.HashMap;

public interface iCustomer {

    boolean checkDuplicate(String productId, HashMap<String, Product> cart);

    Product findProduct(String productKey, HashMap<String, Product> cart);

    String addToCart(String productToBeAdded, int quantityToAdd, HashMap<String, Product> inventory, Customer customer);

    String buyProduct(Customer customer);
}
