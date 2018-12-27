package com.zhou.config.springConfig;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(basePackages = "com.zhou.todo.service")
@Configuration
public class SpringServiceConfig {
}
