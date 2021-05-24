package com.liuwork.eurekaserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @ClassName EurekaServerConfig
 * @Author liuzhihao
 * @Description
 * @Date 2021/4/16 14:20
 * @Version 1.0.0
 */
//@Configuration
//@EnableWebSecurity
//@Slf4j
public class EurekaServerConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        // csrf允许跨域
        http.csrf().disable().httpBasic();
    }
//    @Bean
//    public UserDetailsService userDetailsService(){
//        U1ser.UserBuilder builder = User.withDefaultPasswordEncoder();
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        //必须添加roles，否则报错
//        manager.createUser(builder.username("admin").password("123456").roles("USER").build());
//
//        return manager;
//    }
}
