package igor.springframework.springbeerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;

@SpringBootApplication
public class SpringBeerServiceApplication{

    public static void main(String[] args) {
        SpringApplication.run(SpringBeerServiceApplication.class, args);
    }

}
