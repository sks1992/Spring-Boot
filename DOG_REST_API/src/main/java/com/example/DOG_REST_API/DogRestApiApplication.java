package com.example.DOG_REST_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*@SpringBootApplication annotation. This single annotation is equivalent to using @Configuration, @EnableAutoConfiguration,
and @ComponentScan.
when we run this Spring Boot application, it will automatically scan the components in the current package and
its sub-packages. Thus it will register them in Spring's Application Context, and allow us to inject beans using
@Autowired.*/
@SpringBootApplication
public class DogRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogRestApiApplication.class, args);
	}

}
