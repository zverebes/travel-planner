package travelplanner.websearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class WebSearchApplication {

    private static final Logger logger = LoggerFactory.getLogger(WebSearchApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebSearchApplication.class, args);
    }

    @Bean
    public Consumer<String> search() {
        return logger::info;
    }
}
