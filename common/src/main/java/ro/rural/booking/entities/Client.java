package ro.rural.booking.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by stefan.durla on 24/06/2017.
 */
public class Client {
    @Id
    private String id;
    private String nume;
    private String telefon;
    private String email;
    private String idFacebook;
    private String localitate;

    public Client (){}

    public Client(ClientBuilder builder) {
        this.nume = builder.nume;
        this.telefon = builder.telefon;
        this.email = builder.email;
        this.idFacebook = builder.idFacebook;
        this.localitate = builder.localitate;
    }

    public static ClientBuilder newClient() {
        return new ClientBuilder();
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

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    /**
     * Created by stefan.durla on 24/06/2017.
     */
    public static class ClientBuilder {
            String nume;
            String telefon;
            String email;
            String idFacebook;
            String localitate;

            public ClientBuilder() {
            }

            public Client build() {
                return new Client(this);
            }

            public ClientBuilder nume(String nume) {
                this.nume = nume;
                return this;
            }

            public ClientBuilder telefon(String telefon) {
                this.telefon = telefon;
                return this;
            }

            public ClientBuilder email(String email) {
                this.email = email;
                return this;
            }

            public ClientBuilder idFacebook(String idFacebook) {
                this.idFacebook = idFacebook;
                return this;
            }

            public ClientBuilder localitate(String localitate) {
                this.localitate = localitate;
                return this;
            }
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", nume='" + nume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", idFacebook='" + idFacebook + '\'' +
                ", localitate='" + localitate + '\'' +
                '}';
    }
}
