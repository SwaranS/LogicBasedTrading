package com.database;

import com.database.dao.impl.CompanyDetailsDAOImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Created by Home on 11/9/2016.
 */
public class Main {

    public static void main(String[] coffee) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CompanyDetailsDAOImpl companyDetailsDAO= context.getBean(CompanyDetailsDAOImpl.class);
        try {
            System.out.println(companyDetailsDAO.createCompanyDetails("First"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
