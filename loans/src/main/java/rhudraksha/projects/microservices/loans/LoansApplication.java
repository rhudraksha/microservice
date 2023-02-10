package rhudraksha.projects.microservices.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("rhudraksha.projects.microservices.loans.model")
@ComponentScans({@ComponentScan("rhudraksha.projects.microservices.loans.controller")})
@EnableJpaRepositories("rhudraksha.projects.microservices.loans.repository")
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
