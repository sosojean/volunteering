package com.inha.volunteer.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import java.io.IOException;
import java.io.PrintWriter;

@Configuration
public class AuthSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication){
        String targetUrl = "localhost:3000";
        try {
            response.setStatus(HttpServletResponse.SC_OK);
            PrintWriter writer = response.getWriter();
            writer.write(targetUrl);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }


}
