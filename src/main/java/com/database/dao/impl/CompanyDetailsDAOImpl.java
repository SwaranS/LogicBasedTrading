package com.database.dao.impl;

import com.database.dao.CompanyDetailsDAO;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Home on 11/8/2016.
 */

public class CompanyDetailsDAOImpl implements CompanyDetailsDAO {


    private JdbcTemplate jdbcTemplate;


    private final String INSERT_COMPANY_DETAILS = "INSERT INTO CompanyDetails (companyName) VALUES (?)";

    public Integer createCompanyDetails(String companyName) throws SQLException {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(INSERT_COMPANY_DETAILS,companyName);
        System.out.println(keyHolder.getKey());
        return 1;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
