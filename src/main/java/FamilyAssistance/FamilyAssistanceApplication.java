package FamilyAssistance;

import FamilyAssistance.file.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
@Configuration
@EnableAutoConfiguration
@ComponentScan({"FamilyAssistance.faq", "FamilyAssistance.kazi", "FamilyAssistance.marriageRegistration", "FamilyAssistance.marriedCouple", "FamilyAssistance.person", "FamilyAssistance.file"})
public class FamilyAssistanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FamilyAssistanceApplication.class, args);
    }
}
