package br.com.jntcruz.Gateway.conf;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConf {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("client", r -> r.path("/cliente")
                        .uri("http://localhost:8082/"))
                .route("Staff", r -> r.path("/staff")
                        .uri("http://localhost:8081/"))
                .route("cep - BrasilApi", r -> r.path("/cep/v1/**")
                        .filters(f -> f.rewritePath("/cep/v1/(?<cep>.*)", "/api/cep/v1/${cep}"))
                        .uri("https://brasilapi.com.br/"))
                .route("cep - ViaCep", r -> r.path("/cep/v2/**")
                        .filters(f -> f.rewritePath("/cep/v2/(?<cep>.*)", "/ws/${cep}/json"))
                        .uri("https://viacep.com.br/"))

                .build();
    }
}
