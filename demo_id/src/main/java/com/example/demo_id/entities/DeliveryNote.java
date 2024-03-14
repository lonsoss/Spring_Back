package com.example.demo_id.entities;

import java.util.Date;

public class DeliveryNote {

    private int deliveryNoteId;
    private int orderId;
    private String address;
    private Date deliveryDate;

    public DeliveryNote() {
    }

    public int getDeliveryNoteId() {
        return deliveryNoteId;
    }

    public void setDeliveryNoteId(int deliveryNoteId) {
        this.deliveryNoteId = deliveryNoteId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }    

}
