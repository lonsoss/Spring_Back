package com.example.demo_id.daos;

public class ProductDao {

    private int productId;
    private String productName;
    private float productPrice;
    private int productSerialNumber;
    
    public ProductDao() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductSerialNumber() {
        return productSerialNumber;
    }

    public void setProductSerialNumber(int productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }

}
