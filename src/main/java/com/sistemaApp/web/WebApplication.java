package com.sistemaApp.web;

import com.sistemaApp.web.entidad.Student;
import com.sistemaApp.web.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

        
     @Autowired   
     private StudentRepository repo;
     
    @Override
    public void run(String... args) throws Exception {
//      Student estudiante = new Student("Alberto","Valladares","10037295","adrian.valladarez@gmail.com");
//      repo.save(estudiante);
//      Student estudiante2 = new Student("Adrian","Valladares","10037295","adrian.valladares@gmail.com");
//      repo.save(estudiante2);
    }

}
