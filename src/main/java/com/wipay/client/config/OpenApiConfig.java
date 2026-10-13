package com.wipay.client.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Client Microservice", version = "1.0.0", description = "Client Microservice API"))
public class OpenApiConfig {
}
