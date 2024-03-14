package com.example.demo_id.daos;

public class OrderDao {

    private int orderId;
    private int clientId;
    
    public OrderDao() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getclientId() {
        return clientId;
    }

    public void setclientId(int clientId) {
        this.clientId = clientId;
    }

}
