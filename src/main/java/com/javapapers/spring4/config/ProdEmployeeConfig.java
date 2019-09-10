package com.javapapers.spring4.config;

import com.javapapers.spring4.util.DataSource;
import com.javapapers.spring4.util.ProductionDatabaseUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public abstract class ProdEmployeeConfig {
    @Bean
    public DataSource dataSource() {
        return new ProductionDatabaseUtil();
    }
}
