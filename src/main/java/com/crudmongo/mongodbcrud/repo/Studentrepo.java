package com.crudmongo.mongodbcrud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crudmongo.mongodbcrud.models.Student;

@Repository
public interface Studentrepo extends MongoRepository<Student, String>{
	
	
}
