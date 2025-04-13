package com.chuckle.security.configuration;




import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Bean
    public FilterRegistrationBean<HmacSecurityFilter> hmacFilter() {
        FilterRegistrationBean<HmacSecurityFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new HmacSecurityFilter());
        registrationBean.addUrlPatterns("/api/*"); // Protect API endpoints
        return registrationBean;
    }
}
