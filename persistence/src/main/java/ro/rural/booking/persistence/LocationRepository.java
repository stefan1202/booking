package ro.rural.booking.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.rural.booking.entities.Location;
import ro.rural.booking.entities.Owner;

/**
 * Created by stefan.durla on 24/06/2017.
 */
public interface LocationRepository extends MongoRepository<Location, String> {
}
