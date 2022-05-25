package com.crudmongo.mongodbcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.crudmongo.mongodbcrud.models.ResonseData;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

@RestController
public class RestTemplateController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired ObjectMapper mapper;
	
	  @GetMapping("/getresttemplate") 
	   public Object getResponse() {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setContentType(MediaType.APPLICATION_PDF);
	      HttpEntity <String> requestEntity = new HttpEntity<String>(headers);

	      
	     String url = "https://stage.communication-scaffold.oodleslab.com/chat-api/v1/public/version/BACKEND";
	      ResponseEntity<Object> exchange = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Object.class);
		  System.out.println(exchange); 
		  System.out.println("exchanged data is"+exchange.getBody().toString());
		    
		  HashMap convertValue = mapper.convertValue(exchange.getBody(), HashMap.class);
		  ResonseData data = mapper.convertValue(convertValue.get("data"), ResonseData.class);
		  
		  return data;
		  
	   }
	  
	 
}
