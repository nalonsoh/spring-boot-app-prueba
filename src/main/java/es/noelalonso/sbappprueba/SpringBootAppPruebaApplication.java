package es.noelalonso.sbappprueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringBootAppPruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppPruebaApplication.class, args);
	}

}

