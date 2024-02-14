package by.javaguru.spring.config;

import by.javaguru.spring.utils.ConnectionPool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "by.javaguru.spring",
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Component.class)
        })
public class ApplicationConfiguration {
    @Bean("pool1")
    @Profile("prod")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public Connection connectionPool1(@Value("${db.url}") String url,
                                      @Value("${db.username}") String username,
                                      @Value("${db.pool.size}") Integer poolSize,
                                      @Value("${db.password}") String password) {
        return ConnectionPool.getConnection(url, username, poolSize, password);
    }
}
