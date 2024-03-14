package com.example.demo_id.daos;

import java.util.Date;

public class ExpensesDao {

    private int expensesId;
    private Date expensesDate;
    private String expensesType;
    private float amount;

    public ExpensesDao() {
    }

    public int getexpensesId() {
        return expensesId;
    }
    public void setexpensesId(int expensesId) {
        this.expensesId = expensesId;
    }
    public Date getexpensesDate() {
        return expensesDate;
    }
    public void setexpensesDate(Date expensesDate) {
        this.expensesDate = expensesDate;
    }
    public String getExpensesType() {
        return expensesType;
    }
    public void setExpensesType(String expensesType) {
        this.expensesType = expensesType;
    }
    public float getamount() {
        return amount;
    }
    public void setamount(float amount) {
        this.amount = amount;
    }


}
