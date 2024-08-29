package desafio.generation.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(apiInfo())
                .servers(List.of(new Server().url("http://localhost:8080").description("Servidor Local")))
                .components(new io.swagger.v3.oas.models.Components()
                        .addResponses("200", new ApiResponse().description("Sucesso!"))
                        .addResponses("201", new ApiResponse().description("Criado!"))
                        .addResponses("400", new ApiResponse().description("Erro na requisição!"))
                        .addResponses("401", new ApiResponse().description("Não Autorizado!"))
                        .addResponses("403", new ApiResponse().description("Proibido!"))
                        .addResponses("404", new ApiResponse().description("Não Encontrado!"))
                        .addResponses("500", new ApiResponse().description("Erro!"))
                );
    }

    private Info apiInfo() {
        return new Info()
                .title("API - Alunos")
                .description("Projeto API Spring - Alunos")
                .version("1.0.0")
                .contact(new Contact()
                        .name("Vinicius Bacelar")
                        .url("https://github.com/Viniciusovski")
                        .email("vini98.2012@gmail.com")
                )
                .license(new io.swagger.v3.oas.models.info.License()
                        .name("Apache License Version 2.0")
                        .url("https://github.com/Viniciusovski"));
    }
}
