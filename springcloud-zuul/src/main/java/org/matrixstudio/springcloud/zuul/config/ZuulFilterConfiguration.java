package org.matrixstudio.springcloud.zuul.config;

import org.matrixstudio.springcloud.zuul.web.filter.AuthenticationFilter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class ZuulFilterConfiguration {

    @Bean
    public AuthenticationFilter authenticationFilter() {
        return new AuthenticationFilter();
    }
}
