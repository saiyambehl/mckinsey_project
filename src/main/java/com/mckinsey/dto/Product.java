package com.mckinsey.dto;

public class Product {
    private final ProductType productType;
    private final double price;
    private final String productName;

    public Product(ProductType productType, double price, String productName) {
        this.productType = productType;
        this.price = price;
        this.productName = productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

}
