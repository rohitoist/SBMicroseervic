/*
 * package com.lcwd.UserService.UserService.config;
 * 
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.web.servlet.config.annotation.EnableWebMvc;
 * 
 * import springfox.documentation.builders.ApiInfoBuilder; import
 * springfox.documentation.builders.RequestHandlerSelectors; import
 * springfox.documentation.service.ApiInfo; import
 * springfox.documentation.service.Contact; import
 * springfox.documentation.spi.DocumentationType; import
 * springfox.documentation.spring.web.plugins.Docket; import
 * springfox.documentation.swagger2.annotations.EnableSwagger2;
 * 
 * @Configuration
 * 
 * @EnableSwagger2
 * 
 * @EnableWebMvc public class SwaggerConfig {
 * 
 * 
 * ApiInfo apiInfo() { return new
 * ApiInfoBuilder().title("Student REST CRUD operations API in Spring-Boot 2")
 * .description(
 * "Sample REST API for centalized documentation using Spring Boot and spring-fox swagger 2 "
 * ) .termsOfServiceUrl("").version("0.0.1-SNAPSHOT").contact(new
 * Contact("Deepak Choudhary", "https://github.com/jackfr0st13",
 * "https://github.com/jackfr0st13")).build(); }
 * 
 * @Bean public Docket configureControllerPackageAndConvertors() { return new
 * Docket(DocumentationType.SWAGGER_2).select()
 * .apis(RequestHandlerSelectors.basePackage(
 * "com.lcwd.UserService.UserService.Controller")).build() .apiInfo(apiInfo());
 * }
 * 
 * 
 * }
 */