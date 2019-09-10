package com.javapapers.spring4.config;

import com.javapapers.spring4.util.DataSource;
import com.javapapers.spring4.util.DevDatabaseUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public abstract class DevEmployeeConfig {
    @Bean
    public DataSource dataSource(){
        return new DevDatabaseUtil();
    }
}
