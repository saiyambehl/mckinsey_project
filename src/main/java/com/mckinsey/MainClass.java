package com.mckinsey;

import com.mckinsey.dto.Product;
import com.mckinsey.dto.ProductType;
import com.mckinsey.dto.User;
import com.mckinsey.dto.UserType;
import com.mckinsey.service.ShoppingCart;

import java.util.Date;

public class MainClass {
    public static void main (String[] args)
    {
        User employee = new User("Saiyam", UserType.EMPLOYEE, "", "", new Date());
        Product groceryItem = new Product(ProductType.GROCERY, 2, "A");
        Product otherItem = new Product(ProductType.OTHER ,3, "B");

        ShoppingCart cart = new ShoppingCart(employee);
        cart.addProduct(groceryItem, 5);
        cart.addProduct(otherItem, 7);

        System.out.println(cart.getTotalPrice());
    }
}
