package Code.challenge.spring.boot.application.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rezerwacja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date poczatek;
    private Date koniec;
    @OneToOne
    private Wynajemca wynajemca;
    @OneToOne
    private Najemca najemca;
    @OneToOne
    private Obiekt obiekt;
    private int koszt;

    public Rezerwacja() {
    }

    public Rezerwacja(Long id, Date poczatek, Date koniec, Wynajemca wynajemca, Najemca najemca, Obiekt obiekt, int koszt) {
        this.id = id;
        this.poczatek = poczatek;
        this.koniec = koniec;
        this.wynajemca = wynajemca;
        this.najemca = najemca;
        this.obiekt = obiekt;
        this.koszt = koszt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPoczatek() {
        return poczatek;
    }

    public void setPoczatek(Date poczatek) {
        this.poczatek = poczatek;
    }

    public Date getKoniec() {
        return koniec;
    }

    public void setKoniec(Date koniec) {
        this.koniec = koniec;
    }

    public Wynajemca getWynajemca() {
        return wynajemca;
    }

    public void setWynajemca(Wynajemca wynajemca) {
        this.wynajemca = wynajemca;
    }

    public Najemca getNajemca() {
        return najemca;
    }

    public void setNajemca(Najemca najemca) {
        this.najemca = najemca;
    }

    public Obiekt getObiekt() {
        return obiekt;
    }

    public void setObiekt(Obiekt obiekt) {
        this.obiekt = obiekt;
    }

    public int getKoszt() {
        return koszt;
    }

    public void setKoszt(int koszt) {
        this.koszt = koszt;
    }

    @Override
    public String toString() {
        return "Rezerwacja{" +
                "id=" + id +
                ", poczatek=" + poczatek +
                ", koniec=" + koniec +
                ", wynajemca=" + wynajemca +
                ", najemca=" + najemca +
                ", obiekt=" + obiekt +
                ", koszt=" + koszt +
                '}';
    }
}
