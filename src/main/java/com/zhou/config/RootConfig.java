package com.zhou.config;

import com.zhou.config.springConfig.SpringDaoConfig;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.zhou.todo"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.zhou.todo.controller.*")}
)
@Import({
        SpringDaoConfig.class,
})
public class RootConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer sourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
