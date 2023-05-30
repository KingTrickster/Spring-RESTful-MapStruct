package net.javaguides.springboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Spring Boot REST API Documentation",
				description = "Spring Boot REST API doc",
		version = "v1.0",
		contact = @Contact(
				name = "Alex",
				email = "mail@mail.com",
				url = "https//page.com"
		),
		license = @License(
				name = "Apache 2.0",
				url = "https://license"
		)),
externalDocs = @ExternalDocumentation(
		description = "Spring Boot User Management Documentation",
		url = "https://"
))
public class SpringbootRestfulWebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);
	}

}
