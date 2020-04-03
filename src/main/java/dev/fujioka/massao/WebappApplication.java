package dev.fujioka.massao;

import dev.fujioka.massao.webRest.ProdutoRest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EntityScan("com.fujioka.massao.dev.domain")
//@ComponentScan(basePackageClasses = ProdutoRest.class)
@SpringBootApplication
@EnableAutoConfiguration
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

}
