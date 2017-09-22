package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = {"com.boot"})
@ImportResource("classpath:/META-INF/spring/applicationContext.xml")
public class ApplicationBootstrap extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationBootstrap.class, args);
	}
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationBootstrap.class);
    }
}
