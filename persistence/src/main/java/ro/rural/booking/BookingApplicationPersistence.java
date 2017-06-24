package ro.rural.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.rural.booking.entities.Client;
import ro.rural.booking.persistence.ClientRepository;

import java.util.List;

/**
 * Created by stefan.durla on 24/06/2017.
 */
@SpringBootApplication
public class BookingApplicationPersistence implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;


    public static void main(String[] args) {
        SpringApplication.run(BookingApplicationPersistence.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        List<Client> clients = clientRepository.findAll();
        clients.stream().forEach(client -> client.toString());

    }
}
