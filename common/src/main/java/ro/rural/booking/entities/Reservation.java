package ro.rural.booking.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by stefan.durla on 24/06/2017.
 */
public class Reservation {
    @Id
    private String id;
    private String idCamera;
    private String idClient;
    private String idCalendar;
    private String status;
    private String codeQR;

    private Reservation(Builder builder) {
        this.idCamera = builder.idCamera;
        this.idClient = builder.idClient;
        this.idCalendar = builder.idCalendar;
        this.status = builder.status;
        this.codeQR = builder.codeQR;
    }

    public static Builder newReservation() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCamera() {
        return idCamera;
    }

    public void setIdCamera(String idCamera) {
        this.idCamera = idCamera;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdCalendar() {
        return idCalendar;
    }

    public void setIdCalendar(String idCalendar) {
        this.idCalendar = idCalendar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCodeQR() {
        return codeQR;
    }

    public void setCodeQR(String codeQR) {
        this.codeQR = codeQR;
    }

    public Reservation() {
    }


    public static final class Builder {
        private String idCamera;
        private String idClient;
        private String idCalendar;
        private String status;
        private String codeQR;

        private Builder() {
        }

        public Reservation build() {
            return new Reservation(this);
        }

        public Builder idCamera(String idCamera) {
            this.idCamera = idCamera;
            return this;
        }

        public Builder idClient(String idClient) {
            this.idClient = idClient;
            return this;
        }

        public Builder idCalendar(String idCalendar) {
            this.idCalendar = idCalendar;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder codeQR(String codeQR) {
            this.codeQR = codeQR;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id='" + id + '\'' +
                ", idCamera='" + idCamera + '\'' +
                ", idClient='" + idClient + '\'' +
                ", idCalendar='" + idCalendar + '\'' +
                ", status='" + status + '\'' +
                ", codeQR='" + codeQR + '\'' +
                '}';
    }
}
