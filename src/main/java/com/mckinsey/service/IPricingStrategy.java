package com.mckinsey.service;

import com.mckinsey.dto.Product;

public abstract class IPricingStrategy {
    Product product;

    public IPricingStrategy(Product product) {
        this.product = product;
    }

    abstract double getPrice(int quantity);
}
