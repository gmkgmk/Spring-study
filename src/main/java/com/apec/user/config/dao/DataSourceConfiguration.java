package com.apec.user.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.beans.PropertyVetoException;

/**
 * @author guo.mk
 * @date 2019/8/15 1:59 PM
 */
@Configuration
@MapperScan("com.apec.user.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Primary
    @Bean(name = "dataSource")
    public ComboPooledDataSource createDateSource() throws PropertyVetoException {
        System.out.println(jdbcUrl);
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setDriverClass(jdbcDriver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUsername);
        dataSource.setPassword(jdbcPassword);

        // 关闭连接后 不自动commit
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }

}
