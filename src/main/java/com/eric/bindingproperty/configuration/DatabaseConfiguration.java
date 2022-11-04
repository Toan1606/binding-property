package com.eric.bindingproperty.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "database")
@Data
public class DatabaseConfiguration {
    private String databasename;

    private String url;

    private String username;

    private String password;
}
