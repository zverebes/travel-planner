package travelplanner.keywords;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.function.Supplier;

@SpringBootApplication
@EnableScheduling
public class KeyWordsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeyWordsApplication.class, args);
    }

    @Bean
    @Scheduled(fixedDelay =  1000)
    public Supplier<String> generate() {
        return () -> "test";
    }


}
