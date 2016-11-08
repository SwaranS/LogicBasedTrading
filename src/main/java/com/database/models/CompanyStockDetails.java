package com.database.models;

/**
 * Created by Home on 11/8/2016.
 */
public class CompanyStockDetails {

    private int companyId;
    private double price;
    private long dateTime;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public CompanyStockDetails() {
    }

    public CompanyStockDetails(int companyId, double price, long dateTime) {
        this.companyId = companyId;
        this.price = price;
        this.dateTime = dateTime;
    }
}
