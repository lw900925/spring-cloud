package org.matrixstudio.springcloud.oauth2.security.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class SsoAuthenticationProvider implements AuthenticationProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(SsoAuthenticationProvider.class);

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        LOGGER.info("Authentication principal : {}", authentication.getPrincipal());
        LOGGER.info("Authentication credentials : {}", authentication.getCredentials());
        LOGGER.info("Authentication authorities : {}", authentication.getAuthorities());

        return new UsernamePasswordAuthenticationToken(authentication.getPrincipal(), authentication.getCredentials(), authentication.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        LOGGER.info("SsoAuthenticationProvider supports class name : {}", authentication.getName());
        return true;
    }
}
