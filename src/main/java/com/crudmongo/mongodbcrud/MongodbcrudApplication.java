package com.crudmongo.mongodbcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class MongodbcrudApplication {

	
	 @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
	
	public static void main(String[] args) {
	 SpringApplication.run(MongodbcrudApplication.class, args);
		
	}
	

}
