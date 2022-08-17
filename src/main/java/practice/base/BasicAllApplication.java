package practice.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BasicAllApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicAllApplication.class, args);
	}

}
