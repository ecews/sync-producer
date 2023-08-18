package com.ecews.mqlamisplus.config;//package com.ecews.mqlamisplus.config;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
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
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import org.hibernate.jpa.HibernatePersistenceProvider;
//
//
//@Configuration
//@EnableJpaRepositories(
//        basePackages = {"com.ecews.mqlamisplus.Repository.DestinationRepo"},
//        entityManagerFactoryRef = "destinationEntityManagerFactory",
//        transactionManagerRef = "destinationTransactionManager"
//
//)
//public class DestinationDatabaseConfig {
//
//
//    @Bean(name = "destinationDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.destination")
//    public DataSource destinationDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Primary
//    @Bean(name = "destinationEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean destinationEntityManagerFactory(
//            @Qualifier("destinationDataSource") DataSource dataSource) {
//        return new LocalContainerEntityManagerFactoryBean() {{
//            setDataSource(dataSource);
//            setPackagesToScan("com.ecews.mqlamisplus.models.DestinationPerson");
//            setPersistenceProvider(new HibernatePersistenceProvider()); // Add this line
//        }};
//    }
//
//
//
//
//    @Bean(name = "destinationEntityManager")
//    public EntityManager destinationEntityManager(
//            @Qualifier("destinationEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//        return entityManagerFactory.createEntityManager();
//    }
//
//
//
//
//    @Bean(name = "destinationTransactionManager")
//    public PlatformTransactionManager destinationTransactionManager(
//            @Qualifier("destinationEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}
