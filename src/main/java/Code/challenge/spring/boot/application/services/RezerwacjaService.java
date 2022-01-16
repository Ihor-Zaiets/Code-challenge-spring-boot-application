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

    //todo nie może być dwóch rezerwacji tego samego obiektu jednocześnie
    public void create(Rezerwacja rezerwacja) {
        rezerwacjaRepo.save(rezerwacja);
    }

    //todo tu też
    public void update(Rezerwacja nowaRezerwacja) {
        rezerwacjaRepo.save(nowaRezerwacja);
    }

    public List<Rezerwacja> findByNajemca(String nazwaNajemcy) {
        return rezerwacjaRepo.findAllByNajemca_Nazwa(nazwaNajemcy);
    }

    public List<Rezerwacja> findByObiekt(Long id) {
        return rezerwacjaRepo.findAllByObiekt_Id(id);
    }
}
