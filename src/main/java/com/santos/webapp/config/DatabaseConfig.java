package com.santos.webapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Value("${spring.db.url}")
    private String dbUrl;
    @Value("${spring.db.username}")
    private String dbUsername;
    @Value("${spring.db.password}")
    private String dbPassword;
    @Value("${spring.db.driver}")
    private String driver;


    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(driver);
        dataSourceBuilder.url(dbUrl);
        dataSourceBuilder.username(dbUsername);
        dataSourceBuilder.password(dbPassword);
        return dataSourceBuilder.build();
    }

}
