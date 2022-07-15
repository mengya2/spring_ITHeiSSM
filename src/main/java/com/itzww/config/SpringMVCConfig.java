package com.itzww.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.itzww.controller")    // 扫描这个包下的类，配置到bean中
@EnableWebMvc               // 处理json数据
public class SpringMVCConfig {
}
