package davutcagri.task342;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Task342Application {

	public static void main(String[] args) {
		SpringApplication.run(Task342Application.class, args);
	}

}
