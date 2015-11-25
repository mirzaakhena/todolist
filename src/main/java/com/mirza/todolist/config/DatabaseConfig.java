package com.mirza.todolist.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = { "com.mirza.todolist.model" })
public class DatabaseConfig {

}
