package com.eric.bindingproperty.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/binding")
@PropertySources({
        @PropertySource("classpath:db.properties"),
        @PropertySource("classpath:root.properties")
})
public class BindingController {

    @Value("${database.databasename}")
    private String databaseName;

    @Value("${database.username}")
    private String username;

    @Value("${database.password}")
    private String password;

    @Value("${root.name}")
    private String projectName;

    @GetMapping
    public ResponseEntity<String> home() {
        StringBuilder builder = new StringBuilder();
        return ResponseEntity.ok(builder.append("database name : ")
                .append(this.databaseName)
                .append(", username : ")
                .append(this.username)
                .append(", password : ")
                .append(this.password)
                .append(", project name : ")
                .append(this.projectName)
                .toString());
    }

}
