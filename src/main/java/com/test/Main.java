/**
 * 
 */
package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jeruortiz
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.test")
public class Main extends SpringBootServletInitializer
{
	public static void main(String[] args)
	{
		SpringApplication.run(Main.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application)
	{
		return application.sources(Main.class);
	}
}
