package com.nelioalves.workshopmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class WorkshopmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopmongoApplication.class, args);
	}

	@Autowired
	private MongoTemplate mongoTemplate;

	@EventListener(ApplicationReadyEvent.class)
	public void logDatabaseName() {
		String dbName = mongoTemplate.getDb().getName();
		System.out.println("Banco de dados ativo: " + dbName);
	}
}
