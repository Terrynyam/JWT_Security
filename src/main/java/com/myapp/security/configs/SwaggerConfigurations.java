package com.myapp.security.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Terrance Nyamfukudza
 * @date 29/Aug/2023
 */
@Configuration
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
@OpenAPIDefinition(
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
)
public class SwaggerConfigurations {

    @Bean
    public OpenAPI myOpenAPI() {

        Contact contact = new Contact();
        contact.setEmail("terrynyamz93@gmail.com");
        contact.setName("Tenic Designers");
        contact.setUrl("#");

        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info = new Info()
                .title("Security")
                .version("1.0")
                .contact(contact)
                .description("Security").termsOfService("#")
                .license(mitLicense);

        return new OpenAPI().info(info);

    }
}
