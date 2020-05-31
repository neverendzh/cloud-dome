package com.neverend.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("bk1",r -> r.path("/index").uri("http://www.neverend.cn/user/index"))
                .route("bk2",r -> r.path("/index2").uri("http://www.neverend.cn/new/rel/index")).build();
        return routes.build();
    }
}
