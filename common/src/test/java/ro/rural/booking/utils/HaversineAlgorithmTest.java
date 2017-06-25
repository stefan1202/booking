package ro.rural.booking.utils;

import org.junit.Before;
import org.junit.Test;
import ro.rural.booking.entities.GPSCoordinates;

import static org.junit.Assert.*;

/**
 * Created by stefan.durla on 25/06/2017.
 */
public class HaversineAlgorithmTest {
    GPSCoordinates craiova = new GPSCoordinates("44.269383", "23.839591");
    GPSCoordinates bucuresti = new GPSCoordinates("44.4222781", "26.1156934");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void haversineInM() throws Exception {
        double distance = HaversineAlgorithm.HaversineInM(craiova.getLatVal(), craiova.getLongVal(),
                bucuresti.getLatVal(), bucuresti.getLongVal());
        System.out.println(distance);
        assertEquals(181*1000,distance,999);
    }

    @Test
    public void haversineInKM() throws Exception {
        double distance = HaversineAlgorithm.HaversineInKM(craiova.getLatVal(), craiova.getLongVal(),
                bucuresti.getLatVal(), bucuresti.getLongVal());
        System.out.println(distance);
        assertEquals(181,distance,1);
    }

}