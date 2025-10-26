package com.bookacita.BookaCita.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI bookaCitaAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("BookaCita API")
                        .description("API documentation for BookaCita scheduling platform")
                        .version("v1.0"));
    }
}
