package FamilyAssistance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"FamilyAssistance.faq", "FamilyAssistance.kazi", "FamilyAssistance.marriedcouple", "FamilyAssistance.person"})
public class FamilyAssistanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyAssistanceApplication.class, args);
	}
}
