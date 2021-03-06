package ro.rural.booking.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.rural.booking.entities.Client;
import ro.rural.booking.persistence.ClientRepository;

/**
 * Created by stefan.durla on 24/06/2017.
 */
@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    ClientRepository repository;


    @RequestMapping(value = "/get/{objectId}")
    public Client getByid(@PathVariable String objectId){
        return repository.findOne(objectId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST,consumes = "application/json")
    public Client  getByid(@RequestBody Client object){
        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST,consumes = "application/json")
    public Client  update(@RequestBody Client object){
        return repository.save(object);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST,consumes = "application/json")
    public boolean  delete(@RequestBody Client object){
        repository.delete(object);
        return repository.exists(object.getId());
    }
}
