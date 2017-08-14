package org.matrixstudio.springcloud.zuul.web.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class AuthenticationFilter extends ZuulFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        LOGGER.info("{} {} {}", request.getMethod(), request.getRequestURL().toString(), request.getProtocol());

        String accessToken = request.getParameter("access_token");
        if (StringUtils.isBlank(accessToken)) {
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            return null;
        }

        return null;
    }
}
