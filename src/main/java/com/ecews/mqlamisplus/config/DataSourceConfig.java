//package com.ecews.mqlamisplus.config;
//
//import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//@EnableJpaRepositories(
//        basePackages = "com.ecews.mqlamisplus.Repository")
//@Configuration
//
//public class DataSourceConfig {
//
//    @Primary
//    @Bean(name = "sourceDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.source")
//    public DataSource sourceDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "destinationDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.destination")
//    public DataSource destinationDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//
//
//
//
//// ********************** Transaction and Entitiy Manager ***************************************
//
//
//}
//
