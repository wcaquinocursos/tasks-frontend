package br.ce.wcaquino.tasksfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TasksFrontendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TasksFrontendApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TasksFrontendApplication.class);
	}

}
