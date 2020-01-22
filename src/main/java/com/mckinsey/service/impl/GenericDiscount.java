package com.mckinsey.service.impl;

import com.mckinsey.service.IDiscountType;

public class GenericDiscount implements IDiscountType {
    public double apply(double cartValue) {
        double discount = 0.0d;
        if(cartValue>100){
            discount = (cartValue /100) * 5;
        }
        return cartValue - discount;
    }
}
