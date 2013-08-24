package br.com.acsp.curso.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * User: Christian Reichel
 * Date: 8/24/13
 * Time: 12:50 AM
 */
@Configuration
@ComponentScan(value = "br.com.acsp.curso.config", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = RootConfiguration.class))
public class RootConfiguration {
}