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
    private String coordonateGps;
    private String proprietar;

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

    public String getCoordonateGps() {
        return coordonateGps;
    }

    public void setCoordonateGps(String coordonateGps) {
        this.coordonateGps = coordonateGps;
    }

    public String getProprietar() {
        return proprietar;
    }

    public void setProprietar(String proprietar) {
        this.proprietar = proprietar;
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
                ", proprietar='" + proprietar + '\'' +
                '}';
    }
}
