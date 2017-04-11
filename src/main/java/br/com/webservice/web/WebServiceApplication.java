package br.com.webservice.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.webservice.controllers.PedidosController;

/**
 * 
 * @author Caique dos Santos Coelho
 *
 */

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EntityScan(basePackages={"br.com.webservice.model"})
@EnableJpaRepositories(basePackages={"br.com.webservice.dao"})
@ComponentScan(basePackageClasses = PedidosController.class)
@ComponentScan(basePackages = {"br.com.webservice.validator"})
public class WebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication.class, args);
	}
}