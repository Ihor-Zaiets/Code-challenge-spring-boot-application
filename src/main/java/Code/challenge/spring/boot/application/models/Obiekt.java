package Code.challenge.spring.boot.application.models;

public class Obiekt {
    private String nazwa;
    private int cenaJednostkowa;
    private int powierzchnia;
    private String opis;

    public Obiekt(String nazwa, int cenaJednostkowa, int powierzchnia, String opis) {
        this.nazwa = nazwa;
        this.cenaJednostkowa = cenaJednostkowa;
        this.powierzchnia = powierzchnia;
        this.opis = opis;
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
                "nazwa='" + nazwa + '\'' +
                ", cenaJednostkowa=" + cenaJednostkowa +
                ", powierzchnia=" + powierzchnia +
                ", opis='" + opis + '\'' +
                '}';
    }
}
