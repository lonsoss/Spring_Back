package com.example.demo_id.daos;

import java.util.Date;

public class PaymentDao {

    private int paymentId;
    private String paymentMethod;
    private Date paymentDate;

    public PaymentDao(){
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

