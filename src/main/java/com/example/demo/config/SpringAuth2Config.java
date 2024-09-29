package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringAuth2Config {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeRequests().anyRequest().authenticated()
                .and().oauth2Login();
        return http.build();

    }
//    @Bean
//    public ClientRegistrationRepository clientRepositry(){
//        ClientRegistration clientReg= clientRegistration();
//        return new InMemoryClientRegistrationRepository(clientReg);
//
//    }
//    private ClientRegistration clientRegistration(){
//        return CommonOAuth2Provider.GITHUB.getBuilder("github").clientId("Ov23liE48dNhb2AvpWq3")
//                .clientSecret("37865e6177889cf50371df3acb4623cde944693b").build();
//
//    }
}
