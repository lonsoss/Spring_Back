package com.example.demo_id.daos;

public class ProductPurchaseDao {

    private int productPurchaseId;
    private int purchaseId;
    private int productId;
    private int purchaseQuantity;
    
    public ProductPurchaseDao() {
    }

    public int getProductPurchaseId() {
        return productPurchaseId;
    }

    public void setProductPurchaseId(int productPurchaseId) {
        this.productPurchaseId = productPurchaseId;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(int purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    

}
