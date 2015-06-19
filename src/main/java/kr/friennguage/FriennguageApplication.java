package kr.friennguage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class FriennguageApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FriennguageApplication.class, args);
    }
    
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FriennguageApplication.class);
	}
}
