package com.database.models;

/**
 * Created by Home on 11/8/2016.
 */
public class CompanyDetails {

    private int companyId;
    private String companyName;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanyDetails() {
    }

    public CompanyDetails(int companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }
}
