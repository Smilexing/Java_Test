package com.smile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/3 21:40
 */
public class RouterConfig {
    @Bean
    public RouterFunction<ServerResponse> routerFunction() {
        return RouterFunctions.route(
                RequestPredicates.GET("/hello"),
                request -> ServerResponse.ok().bodyValue("Hello, WebFlux!")
        );
    }
}
