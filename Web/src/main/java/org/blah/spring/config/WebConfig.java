package org.blah.spring.config;

import org.blah.spring.conf.CoreConfig;
import org.blah.spring.conf.PersistenceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by adam on 13.11.16.
 */
@EnableWebMvc
@Configuration
@ComponentScan("org.blah.spring.controller")
@Import(CoreConfig.class)
public class WebConfig {
}
