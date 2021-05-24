package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@EnableFeignClients
//@EnableCircuitBreaker
//@EnableHystrixDashboard
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringbootApplication  extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/rest/" +
                "api/doc/**").addResourceLocations("classpath:/swagger/dist/");
    }
    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);
    }

}
