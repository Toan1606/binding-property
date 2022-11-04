package com.eric.bindingproperty.controller;

import com.eric.bindingproperty.configuration.DatabaseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/binding/hierarchical")
public class BindingHierarchicalProperty {

    @Autowired
    private DatabaseConfiguration databaseConfiguration;

    @GetMapping
    public ResponseEntity<String> home() {
        StringBuilder builder = new StringBuilder();
        return ResponseEntity.ok(builder.append("database name : ")
                .append(databaseConfiguration.getDatabasename())
                .append(", username : ")
                .append(databaseConfiguration.getUsername())
                .append(", password : ")
                .append(databaseConfiguration.getPassword())
                .append(", url : ")
                .append(databaseConfiguration.getUrl())
                .toString());
    }
}
