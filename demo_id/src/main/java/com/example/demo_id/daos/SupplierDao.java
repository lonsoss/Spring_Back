package com.example.demo_id.daos;

public class SupplierDao {

    private int supplierId;
    private String companyName;
    private int NRC;

    SupplierDao(){
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNRC() {
        return NRC;
    }

    public void setNRC(int nRC) {
        NRC = nRC;
    }

}
