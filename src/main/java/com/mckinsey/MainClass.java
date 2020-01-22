package com.mckinsey;

import com.mckinsey.dto.Product;
import com.mckinsey.dto.ProductType;
import com.mckinsey.dto.User;
import com.mckinsey.dto.UserType;
import com.mckinsey.service.IDiscountType;
import com.mckinsey.service.ShoppingCart;
import com.mckinsey.service.impl.GenericDiscount;

import java.util.Date;

public class MainClass {
    public static void main (String[] args)
    {
        User employee = new User("Saiyam", UserType.EMPLOYEE, "", "", new Date());
        Product groceryItem = new Product(ProductType.GROCERY, 2, "Rice");
        Product otherItem = new Product(ProductType.OTHER ,3, "TV");

        ShoppingCart cart = new ShoppingCart(employee,  new GenericDiscount());
        cart.addProduct(groceryItem, 4);
        cart.addProduct(otherItem, 4);

        System.out.println(cart.getTotalPrice());
    }
}
