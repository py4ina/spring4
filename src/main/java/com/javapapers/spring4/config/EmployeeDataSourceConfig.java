package com.javapapers.spring4.config;

import com.javapapers.spring4.util.DataSource;
import com.javapapers.spring4.util.DevDatabaseUtil;
import com.javapapers.spring4.util.ProductionDatabaseUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class EmployeeDataSourceConfig {

    @Bean(name="dataSource")
    @Profile("dev")
    public DataSource getDevDataSource() {
        System.out.println("11");
        return new DevDatabaseUtil();
    }

    @Bean(name="dataSource")
    @Profile("prod")
    public DataSource getProdDataSource() {
        System.out.println("22");
        return new ProductionDatabaseUtil();
    }
}
