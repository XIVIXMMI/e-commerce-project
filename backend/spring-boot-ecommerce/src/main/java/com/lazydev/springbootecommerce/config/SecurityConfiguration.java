//package com.lazydev.springbootecommerce.config;
//
//import com.okta.spring.boot.oauth.Okta;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.accept.ContentNegotiationStrategy;
//import org.springframework.web.accept.HeaderContentNegotiationStrategy;
//import org.springframework.web.cors.CorsConfiguration;
//
////import com.okta.spring.boot.oauth.Okta;
//
//@Configuration
//public class SecurityConfiguration {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        //protect endpoint /api/orders
//        http.authorizeRequests(requests ->
//                        requests
//                                .requestMatchers("/api/orders/**")
//                                .authenticated()
//                                .anyRequest().permitAll())
//                .oauth2ResourceServer(oauth2ResourceServer ->
//                        oauth2ResourceServer.jwt(Customizer.withDefaults()))
//                .cors(cors -> cors.configurationSource(request ->
//                        new CorsConfiguration().applyPermitDefaultValues()));
//
//        //add content negotiation strategy
//        http.setSharedObject(ContentNegotiationStrategy.class, new HeaderContentNegotiationStrategy());
//
//        //force a non-empty response body for 401's to make the response more friendly
//        Okta.configureResourceServer401ResponseBody(http);
//
//        // disable CSRF since we are not using Cookies for session tracking
//        http.csrf(csrf -> csrf.disable());
//
//        return http.build();
//    }
//
//}
