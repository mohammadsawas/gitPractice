package at.refugeescode.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Mhd {
    @Bean
    RestTemplate applicationRunner(){
        return new RestTemplate();
    }

}
