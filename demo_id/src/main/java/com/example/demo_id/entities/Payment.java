package com.example.demo_id.entities;

import java.util.Date;

public class Payment {

    private int paymentId;
    private String paymentMethod;
    private Date paymentDate;

    public Payment(){
    }
    
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }
    
    public String getpaymentMethod() {
        return paymentMethod;
    }
    public void setpaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

}

