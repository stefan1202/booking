package ro.rural.booking.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.rural.booking.entities.Owner;
import ro.rural.booking.entities.Reservation;
import ro.rural.booking.persistence.OwnerRepository;
import ro.rural.booking.persistence.ReservationRepository;

/**
 * Created by stefan.durla on 24/06/2017.
 */
@RestController
@RequestMapping(value = "/reservations")
public class ReservationController {
    @Autowired
    ReservationRepository repository;


    @RequestMapping(value = "/get/{objectId}")
    public Reservation getByid(@PathVariable String objectId){
        return repository.findOne(objectId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST,consumes = "application/json")
    public Reservation  getByid(@RequestBody Reservation object){
        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST,consumes = "application/json")
    public Reservation  update(@RequestBody Reservation object){
        return repository.save(object);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST,consumes = "application/json")
    public boolean  delete(@RequestBody Reservation object){
        repository.delete(object);
        return repository.exists(object.getId());
    }
}
