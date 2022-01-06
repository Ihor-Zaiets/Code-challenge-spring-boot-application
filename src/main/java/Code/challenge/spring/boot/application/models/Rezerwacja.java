package Code.challenge.spring.boot.application.models;

import java.util.Date;

public class Rezerwacja {
    private Date poczatek;
    private Date koniec;
    private Wynajemca wynajemca;
    private Najemca najemca;
    private int koszt;

    public Rezerwacja(Date poczatek, Date koniec, Wynajemca wynajemca, Najemca najemca, int koszt) {
        this.poczatek = poczatek;
        this.koniec = koniec;
        this.wynajemca = wynajemca;
        this.najemca = najemca;
        this.koszt = koszt;
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

    public int getKoszt() {
        return koszt;
    }

    public void setKoszt(int koszt) {
        this.koszt = koszt;
    }

    @Override
    public String toString() {
        return "Rezerwacja{" +
                "poczatek=" + poczatek +
                ", koniec=" + koniec +
                ", wynajemca=" + wynajemca +
                ", najemca=" + najemca +
                ", koszt=" + koszt +
                '}';
    }
}
