package org.ftninformatika.termin20_vezba;

import java.util.Date;
import java.util.List;

public class Glumac {
    private int id;
    private String ime;
    private String prezime;
    private String bio;
    private String foto;
    private float rating;
    private String datumR;
    private String datumS;
    private List<Integer> filmId;

    public Glumac() {
    }

    public Glumac(int id, String ime, String prezime, String bio, String foto, float rating, String datumR, String datumS, List<Integer> filmId) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.bio = bio;
        this.foto = foto;
        this.rating = rating;
        this.datumR = datumR;
        this.datumS = datumS;
        this.filmId = filmId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDatumR() {
        return datumR;
    }

    public void setDatumR(String datumR) {
        this.datumR = datumR;
    }

    public String getDatumS() {
        return datumS;
    }

    public void setDatumS(String datumS) {
        this.datumS = datumS;
    }

    public List<Integer> getFilmId() {
        return filmId;
    }

    public void setFilmId(List<Integer> filmId) {
        this.filmId = filmId;
    }
}
