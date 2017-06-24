package ro.rural.booking.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.rural.booking.entities.Client;
import ro.rural.booking.entities.Reservation;

import java.util.List;

/**
 * Created by stefan.durla on 24/06/2017.
 */
public interface ReservationRepository extends MongoRepository<Reservation, String> {
}
