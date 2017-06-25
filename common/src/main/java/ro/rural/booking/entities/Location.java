package ro.rural.booking.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by stefan.durla on 24/06/2017.
 */
public class Location {
    @Id
    private String id;
    private String denumire;
    private String numarCamere;
    private String clasificare;
    private String localitate;
    private String strada;
    private String numar;
    private String wifi;
    private String parcare;
    private String idCalendar;
    private GPSCoordinates coordonateGps;
    private String owner;

    private Location(Builder builder) {
        this.denumire = builder.denumire;
        this.numarCamere = builder.numarCamere;
        this.clasificare = builder.clasificare;
        this.localitate = builder.localitate;
        this.strada = builder.strada;
        this.numar = builder.numar;
        this.wifi = builder.wifi;
        this.parcare = builder.parcare;
        this.idCalendar = builder.idCalendar;
        this.coordonateGps = builder.coordonateGps;
        this.owner = builder.owner;
    }

    public static Builder newLocation() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getNumarCamere() {
        return numarCamere;
    }

    public void setNumarCamere(String numarCamere) {
        this.numarCamere = numarCamere;
    }

    public String getClasificare() {
        return clasificare;
    }

    public void setClasificare(String clasificare) {
        this.clasificare = clasificare;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getParcare() {
        return parcare;
    }

    public void setParcare(String parcare) {
        this.parcare = parcare;
    }

    public String getIdCalendar() {
        return idCalendar;
    }

    public void setIdCalendar(String idCalendar) {
        this.idCalendar = idCalendar;
    }

    public GPSCoordinates getCoordonateGps() {
        return coordonateGps;
    }

    public void setCoordonateGps(GPSCoordinates coordonateGps) {
        this.coordonateGps = coordonateGps;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id='" + id + '\'' +
                ", denumire='" + denumire + '\'' +
                ", numarCamere='" + numarCamere + '\'' +
                ", clasificare='" + clasificare + '\'' +
                ", localitate='" + localitate + '\'' +
                ", strada='" + strada + '\'' +
                ", numar='" + numar + '\'' +
                ", wifi='" + wifi + '\'' +
                ", parcare='" + parcare + '\'' +
                ", idCalendar='" + idCalendar + '\'' +
                ", coordonateGps='" + coordonateGps + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Location() {
    }


    public static final class Builder {
        private String denumire;
        private String numarCamere;
        private String clasificare;
        private String localitate;
        private String strada;
        private String numar;
        private String wifi;
        private String parcare;
        private String idCalendar;
        private GPSCoordinates coordonateGps;
        private String owner;

        private Builder() {
        }

        public Location build() {
            return new Location(this);
        }

        public Builder denumire(String denumire) {
            this.denumire = denumire;
            return this;
        }

        public Builder numarCamere(String numarCamere) {
            this.numarCamere = numarCamere;
            return this;
        }

        public Builder clasificare(String clasificare) {
            this.clasificare = clasificare;
            return this;
        }

        public Builder localitate(String localitate) {
            this.localitate = localitate;
            return this;
        }

        public Builder strada(String strada) {
            this.strada = strada;
            return this;
        }

        public Builder numar(String numar) {
            this.numar = numar;
            return this;
        }

        public Builder wifi(String wifi) {
            this.wifi = wifi;
            return this;
        }

        public Builder parcare(String parcare) {
            this.parcare = parcare;
            return this;
        }

        public Builder idCalendar(String idCalendar) {
            this.idCalendar = idCalendar;
            return this;
        }

        public Builder coordonateGps(GPSCoordinates coordonateGps) {
            this.coordonateGps = coordonateGps;
            return this;
        }

        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }
    }
}
