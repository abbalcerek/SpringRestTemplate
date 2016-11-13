package org.blah.spring.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by adam on 13.11.16.
 */
@Configuration
@ComponentScan("org.blah.spring.service")
@Import(PersistenceConfig.class)
public class CoreConfig {
}
