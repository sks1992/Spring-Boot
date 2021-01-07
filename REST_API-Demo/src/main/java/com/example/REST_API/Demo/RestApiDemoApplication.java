package com.example.REST_API.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*Create a simple REST API for return airport location*/

/*@SpringBootApplication annotation. This single annotation is equivalent to using @Configuration, @EnableAutoConfiguration,
and @ComponentScan.
when we run this Spring Boot application, it will automatically scan the components in the current package and
its sub-packages. Thus it will register them in Spring's Application Context, and allow us to inject beans using
@Autowired.*/
@SpringBootApplication
public class RestApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiDemoApplication.class, args);
	}

}
/*
* to create a REST API we need these dependency
* .
* Spring Web WEB
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

* Spring Data JPA SQL
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

* H2 Database SQL
Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports
embedded and server modes as well as a browser based console application.
* */