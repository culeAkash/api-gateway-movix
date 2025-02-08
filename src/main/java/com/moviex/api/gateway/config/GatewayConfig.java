package com.moviex.api.gateway.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service",r->r.path("/api/v1/users/**")
                        .uri("lb://user-service")
                )
                .route("movie-service",r->r.path("/api/v1/movies/**")
                        .uri("lb://movie-service")
                )
                .route("movie-service",r->r.path("/api/v1/movieGenres/**")
                        .uri("lb://movie-service")
                )
                .route("review-service",r->r.path("/api/v1/reviews/**")
                        .uri("lb://review-service")
                )
                .route("rating-service",r->r.path("/api/v1/ratings/**")
                        .uri("lb://rating-service")
                )
                .build();
    }
}
