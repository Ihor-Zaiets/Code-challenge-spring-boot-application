package Code.challenge.spring.boot.application.services;

import Code.challenge.spring.boot.application.models.Rezerwacja;
import Code.challenge.spring.boot.application.models.RezerwacjaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezerwacjaService {

    private final RezerwacjaRepo rezerwacjaRepo;

    @Autowired
    public RezerwacjaService(RezerwacjaRepo rezerwacjaRepo) {
        this.rezerwacjaRepo = rezerwacjaRepo;
    }

    public List<Rezerwacja> showAll() {
        return rezerwacjaRepo.findAll();
    }

    /** Metoda szuka, czy nie ma nakadań rezerwacji dla tego samego obiektu w tym samym czasie.
    * */
    public void save(Rezerwacja rezerwacja) {
        if (rezerwacjaRepo.findAllPoczatek(rezerwacja.getObiekt().getId(), rezerwacja.getPoczatek(), rezerwacja.getKoniec()) == 0 &&
        rezerwacjaRepo.findAllKoniec(rezerwacja.getObiekt().getId(), rezerwacja.getPoczatek(), rezerwacja.getKoniec()) == 0)
            rezerwacjaRepo.save(rezerwacja);
    }

    public List<Rezerwacja> findByNajemca(String nazwaNajemcy) {
        return rezerwacjaRepo.findAllByNajemca_Nazwa(nazwaNajemcy);
    }

    public List<Rezerwacja> findByObiekt(Long id) {
        return rezerwacjaRepo.findAllByObiekt_Id(id);
    }
}
