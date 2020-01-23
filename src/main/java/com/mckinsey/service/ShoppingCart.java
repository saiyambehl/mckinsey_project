package com.mckinsey.service;

import com.mckinsey.dto.Product;
import com.mckinsey.dto.User;
import com.mckinsey.dto.UserType;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> products;
    private User user;

    public ShoppingCart(User user) {
        this.products = new HashMap<Product, Integer>();
        this.user = user;
    }
    public void addProduct(Product product, int quantity){
        if(products.containsKey(product)) {
            products.put(product, products.get(product) + quantity);
        }else{
            products.put(product, quantity);
        }
    }
    public double getProductPrice(Product product, int quantity){
        IPricingStrategy pricingStrategy = null;
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.setTime(new Date());
        c2.setTime(user.getDateOfJoining());

        if (user.getUserType().equals(UserType.EMPLOYEE)) {
            pricingStrategy = new PercentageStrategy(product,30);
        }else if (user.getUserType().equals(UserType.AFFILIATE)) {
            pricingStrategy = new PercentageStrategy(product,10);
        }else if (user.getUserType().equals(UserType.CUSTOMER) && (c1.get(Calendar.YEAR) - c2.get(Calendar.YEAR) > 2)) {
            pricingStrategy = new PercentageStrategy(product,5);
        }else{
            pricingStrategy = new PercentageStrategy(product,0);
        }
        double totalPrice = pricingStrategy.getPrice(quantity);
        double discount = 0.0d;
        if(totalPrice > 100){
            discount = (totalPrice /100) * 5;
        }
        return totalPrice;

    }
    public double getTotalPrice(){
        return products.entrySet().stream().map(x-> getProductPrice(x.getKey(), x.getValue())).mapToDouble(y->y).sum();
    }
}
