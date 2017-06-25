package ro.rural.booking.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.rural.booking.entities.Reservation;
import ro.rural.booking.entities.Room;
import ro.rural.booking.persistence.ReservationRepository;
import ro.rural.booking.persistence.RoomRepository;

/**
 * Created by stefan.durla on 24/06/2017.
 */
@RestController
@RequestMapping(value = "/rooms")
public class RoomsController {
    @Autowired
    RoomRepository repository;


    @RequestMapping(value = "/get/{objectId}")
    public Room getByid(@PathVariable String objectId){
        return repository.findOne(objectId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST,consumes = "application/json")
    public Room  getByid(@RequestBody Room object){
        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST,consumes = "application/json")
    public Room  update(@RequestBody Room object){
        return repository.save(object);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST,consumes = "application/json")
    public boolean  delete(@RequestBody Room object){
        repository.delete(object);
        return repository.exists(object.getId());
    }
}
