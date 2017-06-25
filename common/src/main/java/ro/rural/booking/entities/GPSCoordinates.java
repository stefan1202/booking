package ro.rural.booking.entities;

/**
 * Created by stefan.durla on 25/06/2017.
 */
public class GPSCoordinates {
    private String latitude;
    private String longitude;

    public GPSCoordinates() {
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
