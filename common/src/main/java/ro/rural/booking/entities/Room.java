package ro.rural.booking.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by stefan.durla on 24/06/2017.
 */
public class Room {
    @Id
    private String id;
    private String numar;
    private String etaj;
    private String baie;
    private String idCalendar;
    private String idLocatie;

    private Room(Builder builder) {
        this.numar = builder.numar;
        this.etaj = builder.etaj;
        this.baie = builder.baie;
        this.idCalendar = builder.idCalendar;
        this.idLocatie = builder.idLocatie;
    }

    public static Builder newRoom() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public String getEtaj() {
        return etaj;
    }

    public void setEtaj(String etaj) {
        this.etaj = etaj;
    }

    public String getBaie() {
        return baie;
    }

    public void setBaie(String baie) {
        this.baie = baie;
    }

    public String getIdCalendar() {
        return idCalendar;
    }

    public void setIdCalendar(String idCalendar) {
        this.idCalendar = idCalendar;
    }

    public String getIdLocatie() {
        return idLocatie;
    }

    public void setIdLocatie(String idLocatie) {
        this.idLocatie = idLocatie;
    }

    public Room() {
    }

    public static final class Builder {
        private String numar;
        private String etaj;
        private String baie;
        private String idCalendar;
        private String idLocatie;

        private Builder() {
        }

        public Room build() {
            return new Room(this);
        }

        public Builder numar(String numar) {
            this.numar = numar;
            return this;
        }

        public Builder etaj(String etaj) {
            this.etaj = etaj;
            return this;
        }

        public Builder baie(String baie) {
            this.baie = baie;
            return this;
        }

        public Builder idCalendar(String idCalendar) {
            this.idCalendar = idCalendar;
            return this;
        }

        public Builder idLocatie(String idLocatie) {
            this.idLocatie = idLocatie;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", numar='" + numar + '\'' +
                ", etaj='" + etaj + '\'' +
                ", baie='" + baie + '\'' +
                ", idCalendar='" + idCalendar + '\'' +
                ", idLocatie='" + idLocatie + '\'' +
                '}';
    }
}
