package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Security {
    @GeneratedValue
    private long securityId;

    @OneToMany
    @JoinColumn
    private long portfolioId;
    private Portfolio portfolio;

    @Column(nullable=false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column (nullable = false)
    private double purchasePrice;

    @Column (nullable = false)
    private String purchaseDate;

    @Column (nullable = false)
    private long quantity;

    public Security(String name,String category,double purchasePrice,String purchaseDate,long quantity)
    {
    this.name=name;
    this.category=category;
    this.purchasePrice=purchasePrice;
    this.purchaseDate=purchaseDate;
    this.quantity=quantity;
    }

    private void setName(String name){
        this.name=name;
    }

    private void setCategory(String category){
        this.category=category;
    }

    private void setPurchasePrice(double purchasePrice){
        this.purchasePrice=purchasePrice;
    }

    private void setPurchaseDate(String purchaseDate){
        this.purchaseDate=purchaseDate;
    }
    private void setQuantity(long quantity){
        this.quantity=quantity;
    }

    public String getName(){return name;}
    public String getCategory() {return category;}
    public double getPurchasePrice(){return purchasePrice;}
    public String getPurchaseDate(){return purchaseDate;}
    public long getQuantity(){return quantity;}
}
