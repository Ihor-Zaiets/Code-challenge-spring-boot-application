package Code.challenge.spring.boot.application.models;

public class Najemca {
    private String nazwa;

    public Najemca(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Najemca{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
