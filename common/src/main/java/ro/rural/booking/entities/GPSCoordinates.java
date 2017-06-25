package ro.rural.booking.entities;

/**
 * Created by stefan.durla on 25/06/2017.
 */
public class GPSCoordinates {
    private String latitude;
    private String longitude;
    private double latVal;
    private double longVal;

    public GPSCoordinates() {
    }

    public GPSCoordinates(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.latVal = Double.valueOf(latitude);
        this.longVal = Double.valueOf(longitude);
    }

    public GPSCoordinates(double latVal, double longVal) {
        this.latitude = String.valueOf(latVal);
        this.longitude = String.valueOf(longVal);
        this.latVal = latVal;
        this.longVal = longVal;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
        this.latVal = Double.valueOf(latitude);
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
        this.longVal = Double.valueOf(longitude);
    }

    public double getLatVal() {
        return latVal;
    }

    public void setLatVal(double latVal) {
        this.latVal = latVal;
        this.latitude = String.valueOf(latVal);

    }

    public double getLongVal() {
        return longVal;
    }

    public void setLongVal(double longVal) {
        this.longVal = longVal;
        this.longitude = String.valueOf(longVal);
    }
}
