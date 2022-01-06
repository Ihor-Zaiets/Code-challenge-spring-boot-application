package Code.challenge.spring.boot.application.models;

public class Wynajemca {
    private String nazwa;

    public Wynajemca(String nazwa) {
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
        return "Wynajemca{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
