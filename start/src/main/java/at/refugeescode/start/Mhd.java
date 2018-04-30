package at.refugeescode.start;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mhd {
    @Bean
    ApplicationRunner  applicationRunner(){
        return args -> {
            System.out.println("my cool hello world");
        };
    }

}
