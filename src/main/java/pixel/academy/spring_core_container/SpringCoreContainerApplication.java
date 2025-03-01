package pixel.academy.spring_core_container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"pixel.academy.spring_core_container," +
		"util"}
)
public class SpringCoreContainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreContainerApplication.class, args);
	}

}
