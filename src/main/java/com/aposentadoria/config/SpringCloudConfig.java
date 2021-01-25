package com.aposentadoria.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Value("${url.beneficiario}")
    private String urlBeneficiario;

    @Value("${url.caixa-eletronico}")
    private String urlCaixaEletronico;

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/api/beneficiario/**")
                        .uri(urlBeneficiario))
                .route(p -> p
                        .path("/api/caixa-eletronico/**")
                        .uri(urlCaixaEletronico))
                .build();
    }

}