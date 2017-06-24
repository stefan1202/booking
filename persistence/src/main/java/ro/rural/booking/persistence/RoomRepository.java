package ro.rural.booking.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.rural.booking.entities.Room;

/**
 * Created by stefan.durla on 24/06/2017.
 */
public interface RoomRepository extends MongoRepository<Room, String> {
}
