package ma.enset.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.nio.file.Path;

@SpringBootApplication
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

/*    @Bean
  public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("R1", pre->pre.path("/customers/**").uri("lb://CUSTOMER-SERVICE"))
                .route("R2", pre->pre.path("/products/**").uri("lb://INVENTORY-SERVICE"))
                .build();
    }*/
    @Bean
    public DiscoveryClientRouteDefinitionLocator dynamicRoute
    (ReactiveDiscoveryClient rc, DiscoveryLocatorProperties DLP) {
        return new DiscoveryClientRouteDefinitionLocator(rc, DLP);
    }
}
