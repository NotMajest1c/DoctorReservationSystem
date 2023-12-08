package com.example.reservationmanagement.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SwaggerConfig {

    @Bean
    @Scope("prototype")
    public OpenAPI employeesMicroserviceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Test")
                        .description("Customer Api")
                        .version("1.0"));
    }
}