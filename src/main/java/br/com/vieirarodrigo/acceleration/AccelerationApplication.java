package br.com.vieirarodrigo.acceleration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AccelerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccelerationApplication.class, args);
	}

}
