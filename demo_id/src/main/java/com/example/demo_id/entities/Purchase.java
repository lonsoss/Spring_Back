package com.example.demo_id.entities;

import java.util.Date;

public class Purchase {

    private int puchaseId;
    private Date purchaseDate;
    private int purchaseAmount;

    public Purchase() {
    }

    public int getPuchaseId() {
        return puchaseId;
    }

    public void setPuchaseId(int puchaseId) {
        this.puchaseId = puchaseId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    

}
