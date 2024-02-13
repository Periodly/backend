package app.content.prd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"app.content.prd.dto"})
public class PrdApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrdApplication.class, args);
	}

}
