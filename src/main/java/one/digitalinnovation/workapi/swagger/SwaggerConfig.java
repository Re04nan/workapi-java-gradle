package one.digitalinnovation.workapi.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Digital Innovation One")
                .description("API - Controle de Ponto e Acesso")
                .version("1.0.0")
                .termsOfService("http://swagger.io/terms")
                .license(new License()
                        .name("Apache 2.0")
                        .url("http://springdoc.org")));
    }
}
