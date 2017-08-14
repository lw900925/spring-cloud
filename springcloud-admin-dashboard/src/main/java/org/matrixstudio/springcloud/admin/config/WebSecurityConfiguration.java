package org.matrixstudio.springcloud.admin.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootConfiguration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);

        // Page with login form is served as /login.html and does a POST on /login
        http.formLogin().loginPage("/login.html").loginProcessingUrl("/login").permitAll();
        // The UI does a POST on /logout on logout
        http.logout().logoutUrl("/logout");
        // The ui currently doesn't support csrf
        http.csrf().disable();

        // Requests for the login page and the static assets are allowed
//        http.authorizeRequests()
//                .antMatchers("/login.html", "/**/*.css", "/img/**", "/third-party/**")
//                .permitAll();
        // ... and any other request needs to be authorized
        http.authorizeRequests().antMatchers("/**").authenticated();

        // Enable so that the clients can authenticate via HTTP basic for registering
        http.httpBasic();
    }
}
