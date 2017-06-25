package ro.rural.booking.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.rural.booking.entities.Owner;
import ro.rural.booking.persistence.OwnerRepository;

/**
 * Created by stefan.durla on 24/06/2017.
 */
@RestController
@RequestMapping(value = "/owners")
public class OwnerController {
    @Autowired
    OwnerRepository repository;


    @RequestMapping(value = "/get/{objectId}")
    public Owner getByid(@PathVariable String objectId){
        return repository.findOne(objectId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST,consumes = "application/json")
    public Owner  getByid(@RequestBody Owner object){
        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST,consumes = "application/json")
    public Owner  update(@RequestBody Owner object){
        return repository.save(object);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST,consumes = "application/json")
    public boolean  delete(@RequestBody Owner object){
        repository.delete(object);
        return repository.exists(object.getId());
    }
}
