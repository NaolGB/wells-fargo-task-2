package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private double purcahsePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private double quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio, String name, String category, double purchasePrice, String purchaseDate, double qunatity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purcahsePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = qunatity;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purcahsePrice = purchasePrice;
    }

    public double getPurchasePrice() {
        return purcahsePrice;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }
}
