package com.cydoe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = {"com.cydoe.proxy", "com.cydoe.service","com.cydoe.repository"})

public class CommentConfig {

}
