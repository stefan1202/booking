import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ro.rural.booking.BookingApplicationPersistence;
import ro.rural.booking.entities.Client;
import ro.rural.booking.entities.Location;
import ro.rural.booking.persistence.LocationRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by stefan.durla on 24/06/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookingApplicationPersistence.class)
public class LocationRepositoryTests {
    @Autowired
    LocationRepository repository;

    Location location1,location2, location3;
    Location.Builder builder = Location.newLocation();
    @Before
    public void setUp() {

//        repository.deleteAll();
        location1 = repository.save(builder.denumire("Locatie1").clasificare("3*").localitate("Bucuresti").parcare("NU").proprietar("Stefan").build());
        location2 = repository.save(builder.denumire("Locatie2").clasificare("2*").localitate("Craiova").parcare("NU").proprietar("Stefan").build());
        location3 = repository.save(builder.denumire("Locatie3").clasificare("4*").localitate("Pitesti").parcare("NU").proprietar("Mihai").build());
    }

    @Test
    public void setsIdOnSave() {

        Location radu = repository.save(builder.denumire("Locatie1").clasificare("3*").localitate("Bucuresti").parcare("NU").proprietar("Stefan").build());;

        assertThat(radu.getId()).isNotNull();
    }

    @Test
    public void readPersistence(){
        List<Location> locations = repository.findAll();
        for (Location client: locations){
            System.out.println(client);
        }
        locations.stream().forEach(location -> location.toString());
    }

    @Test
    public void findByTelefonContains(){
//        Assert.assertEquals(1, repository.findClientsByTelefonContains("0723").size());
//        Assert.assertEquals(3, repository.findClientsByTelefonContains("1234").size());
//        Assert.assertEquals(2, repository.findClientsByTelefonContains("0123").size());
    }




}
