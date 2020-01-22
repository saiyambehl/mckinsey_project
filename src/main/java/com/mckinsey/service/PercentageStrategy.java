package com.mckinsey.service;

import com.mckinsey.dto.Product;
import com.mckinsey.dto.ProductType;

public class PercentageStrategy extends IPricingStrategy {
    private double percentageDiscount;
    public PercentageStrategy(Product product, int percentageDiscount) {
        super(product);
        this.percentageDiscount = percentageDiscount / 100.0;
    }
    @Override
    double getPrice(int quantity) {
        if(product.getProductType().equals(ProductType.GROCERY))
            return product.getPrice() * quantity;
        else
            return ( (product.getPrice() * quantity) *  (1.0 - percentageDiscount));
    }


}
