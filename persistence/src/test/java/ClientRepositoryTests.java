import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ro.rural.booking.BookingApplicationPersistence;
import ro.rural.booking.entities.Client;
import ro.rural.booking.persistence.ClientRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by stefan.durla on 24/06/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookingApplicationPersistence.class)
public class ClientRepositoryTests {
    @Autowired
    ClientRepository clientRepository;

    Client radu,mihai, matei;
    Client.ClientBuilder builder = Client.newClient();
    @Before
    public void setUp() {

        clientRepository.deleteAll();
        radu = clientRepository.save(builder.nume("radu").email("radu@email.com").idFacebook("facebook.radu").localitate("Craiova").telefon("0720123456").build());
        mihai = clientRepository.save(builder.nume("mihai").email("mihai@email.com").idFacebook("facebook.mihai").localitate("Craiova").telefon("0720123456").build());
        matei = clientRepository.save(builder.nume("matei").email("matei@email.com").idFacebook("facebook.matei").localitate("Craiova").telefon("0723123456").build());
    }

    @Test
    public void setsIdOnSave() {

        Client radu = clientRepository.save(builder.email("radu@email.com").idFacebook("facebook.radu").localitate("Craiova").telefon("0720123456").build());

        assertThat(radu.getId()).isNotNull();
    }

    @Test
    public void readPersistence(){
        List<Client> clients = clientRepository.findAll();
        for (Client client: clients){
            System.out.println(client);
        }
        clients.stream().forEach(client -> client.toString());
    }

    @Test
    public void findByTelefonContains(){
        Assert.assertEquals(1,clientRepository.findClientsByTelefonContains("0723").size());
        Assert.assertEquals(3,clientRepository.findClientsByTelefonContains("1234").size());
        Assert.assertEquals(2,clientRepository.findClientsByTelefonContains("0123").size());
    }




}
