package ro.rural.booking;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by stefan.durla on 24/06/2017.
 */
@SpringBootApplication
public class WebApplication implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Run the app");
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
