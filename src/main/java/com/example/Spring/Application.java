package com.example.Spring;

import com.example.Spring.model.Aliens;
import com.example.Spring.model.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ApplicationContext context= SpringApplication.run(Application.class, args);
	 LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

	}

}
