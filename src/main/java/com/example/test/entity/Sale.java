package com.example.test.entity;

import javax.persistence.*;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long SiNo;
    private int SalesmanID;
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ProdID")
    private Product product;
    private Product ProdID;
    private String SalesmanName;
    private long DOS;

    public long getSiNo() {
        return SiNo;
    }

    public void setSiNo(long siNo) {
        SiNo = siNo;
    }

    public int getSalesmanID() {
        return SalesmanID;
    }

    public void setSalesmanID(int salesmanID) {
        SalesmanID = salesmanID;
    }

    public Product getProdID() {
        return ProdID;
    }

    public void setProdID(Product prodID) {
        ProdID = prodID;
    }

    public String getSalesmanName() {
        return SalesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        SalesmanName = salesmanName;
    }

    public long getDOS() {
        return DOS;
    }

    public void setDOS(long DOS) {
        this.DOS = DOS;
    }

    public Sale() {
    }
}
