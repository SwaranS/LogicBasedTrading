package com.database.dao;

import java.sql.SQLException;

/**
 * Created by Home on 11/8/2016.
 */
public interface CompanyDetailsDAO {

    public Integer createCompanyDetails(String companyName) throws SQLException;
}
