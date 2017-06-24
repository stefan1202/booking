package ro.rural.booking.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.rural.booking.entities.Client;

import java.util.List;

/**
 * Created by stefan.durla on 24/06/2017.
 */
public interface ClientRepository extends MongoRepository<Client, String> {
    Client findClientByEmail(String email);
    Client findClientsByLocalitate(String email);
    List<Client> findClientsByTelefonContains(String telefon);
}
