package Code.challenge.spring.boot.application.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Obiekt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwa;
    private int cenaJednostkowa;
    private int powierzchnia;
    private String opis;

    public Obiekt() {
    }

    public Obiekt(String nazwa, int cenaJednostkowa, int powierzchnia, String opis) {
        this.nazwa = nazwa;
        this.cenaJednostkowa = cenaJednostkowa;
        this.powierzchnia = powierzchnia;
        this.opis = opis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCenaJednostkowa() {
        return cenaJednostkowa;
    }

    public void setCenaJednostkowa(int cenaJednostkowa) {
        this.cenaJednostkowa = cenaJednostkowa;
    }

    public int getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(int powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Obiekt{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", cenaJednostkowa=" + cenaJednostkowa +
                ", powierzchnia=" + powierzchnia +
                ", opis='" + opis + '\'' +
                '}';
    }
}
