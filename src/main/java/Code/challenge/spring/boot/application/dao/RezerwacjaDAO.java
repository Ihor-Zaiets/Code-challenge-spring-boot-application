package Code.challenge.spring.boot.application.dao;

import Code.challenge.spring.boot.application.models.Obiekt;
import Code.challenge.spring.boot.application.models.Rezerwacja;
import Code.challenge.spring.boot.application.models.RezerwacjaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RezerwacjaDAO {

    private final RezerwacjaRepo rezerwacjaRepo;

    @Autowired
    public RezerwacjaDAO(RezerwacjaRepo rezerwacjaRepo) {
        this.rezerwacjaRepo = rezerwacjaRepo;
    }

    public void save(Rezerwacja rezerwacja) {
        rezerwacjaRepo.save(rezerwacja);
    }

    public void update(Rezerwacja nowaRezerwacja) {
        rezerwacjaRepo.save(nowaRezerwacja);
    }

    public List<Rezerwacja> showAllByNajemca(String nazwaNajemcy) {
        return rezerwacjaRepo.findAllByNajemca_Nazwa(nazwaNajemcy);
    }

    public List<Rezerwacja> showAllByObiekt(Long id) {
        return rezerwacjaRepo.findAllByObiekt_Id(id);
    }
}
