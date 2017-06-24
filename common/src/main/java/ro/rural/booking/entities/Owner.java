package ro.rural.booking.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by stefan.durla on 24/06/2017.
 */
public class Owner {
    @Id
    private String id;
    private String nume;
    private String telefon;
    private String email;
    private String idFacebook;

    private Owner(Builder builder) {
        this.nume = builder.nume;
        this.telefon = builder.telefon;
        this.email = builder.email;
        this.idFacebook = builder.idFacebook;
    }

    public static Builder newOwner() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdFacebook() {
        return idFacebook;
    }

    public void setIdFacebook(String idFacebook) {
        this.idFacebook = idFacebook;
    }

    public Owner() {
    }

    public static final class Builder {
        private String nume;
        private String telefon;
        private String email;
        private String idFacebook;

        private Builder() {
        }

        public Owner build() {
            return new Owner(this);
        }

        public Builder nume(String nume) {
            this.nume = nume;
            return this;
        }

        public Builder telefon(String telefon) {
            this.telefon = telefon;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder idFacebook(String idFacebook) {
            this.idFacebook = idFacebook;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id='" + id + '\'' +
                ", nume='" + nume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", idFacebook='" + idFacebook + '\'' +
                '}';
    }
}
