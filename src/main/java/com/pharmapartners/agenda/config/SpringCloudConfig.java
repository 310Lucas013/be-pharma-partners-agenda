package com.pharmapartners.agenda.config;

import reactor.core.publisher.Mono;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/employees/**")
                        .uri("http://localhost:5001/")
                        .id("employeeModule"))
                .route(r -> r.path("/credentials/**")
                        .uri("http://localhost:5002/")
                        .id("credentialModule"))
                .route(r -> r.path("/patients/**")
                        .uri("http://localhost:5003/")
                        .id("patientModule"))
                .route(r -> r.path("/appointments/**")
                        .uri("http://localhost:5004/")
                        .id("appointmentModule"))
                .build();
    }
}
