package ro.rural.booking.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.rural.booking.entities.Location;
import ro.rural.booking.persistence.LocationRepository;

import java.util.List;

/**
 * Created by stefan.durla on 24/06/2017.
 */
@RestController
@RequestMapping(value = "/locations")
public class LocationController {
    @Autowired
    LocationRepository repository;


    @RequestMapping(value = "/get/{locationId}")
    public Location  getByid(@PathVariable String locationId){
        return repository.findOne(locationId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST,consumes = "application/json")
    public Location  getByid(@RequestBody Location location){
        return repository.save(location);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST,consumes = "application/json")
    public Location  update(@RequestBody Location location){
        return repository.save(location);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST,consumes = "application/json")
    public void  delete(@RequestBody Location location){
        repository.delete(location);
    }

    @RequestMapping(value = "/findByOwner/{}", method = RequestMethod.POST)
    public List<Location>  update(@PathVariable String owner){
        return repository.findAllByOwner(owner);
    }

}
