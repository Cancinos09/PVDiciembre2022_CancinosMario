package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PvDiciembre2022Application {

	public static void main(String[] args) {
		SpringApplication.run(PvDiciembre2022Application.class, args);
	}

}
