package com.grayMatter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//configuration title to the application
@ComponentScan("com.grayMatter.beans")
@PropertySource("classpath:data.properties")
public class ShopConfig {

}
