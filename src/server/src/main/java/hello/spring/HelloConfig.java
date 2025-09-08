package hello.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {  // -> AppInitV2

    @Bean
    public HelloController helloController(){
        return new HelloController();
    }
}
