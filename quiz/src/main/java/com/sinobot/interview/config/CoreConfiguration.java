package com.sinobot.interview.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EntityScan("com.sinobot.interview.model")
@EnableJpaRepositories("com.sinobot.interview.repository")
@EnableWebMvc
@ComponentScan({
        "com.sinobot.interview.service",
        "com.sinobot.interview.controller"})
@Import({DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class CoreConfiguration {
}
