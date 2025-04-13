package com.chuckle.security.configuration;

import com.chuckle.security.configuration.HmacUtil;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class HmacSecurityFilter extends OncePerRequestFilter {

    private static final String HMAC_HEADER = "X-HMAC-Signature";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String providedHmac = request.getHeader(HMAC_HEADER);

        if (providedHmac == null) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Missing HMAC signature");
            return;
        }

        // Construct request data (URL + query parameters)
        String requestData = request.getRequestURI() + (request.getQueryString() == null ? "" : "?" + request.getQueryString());

        if (!HmacUtil.verifyHmac(requestData, providedHmac)) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Invalid HMAC signature");
            return;
        }

        filterChain.doFilter(request, response);
    }
}