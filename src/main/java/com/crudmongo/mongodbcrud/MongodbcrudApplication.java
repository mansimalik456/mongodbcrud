package com.crudmongo.mongodbcrud;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.crudmongo.mongodbcrud.repo.Studentrepo;



@SpringBootApplication
public class MongodbcrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MongodbcrudApplication.class, args);
		
		Studentrepo studentrepo = context.getBean(Studentrepo.class);
		
		System.out.println("Print Mansi Data : ");
		List<String> user = studentrepo.findAllByNameContaining("Mansi Malik");
		user.forEach(a->System.out.println(a)); 
		
		
	}

}
