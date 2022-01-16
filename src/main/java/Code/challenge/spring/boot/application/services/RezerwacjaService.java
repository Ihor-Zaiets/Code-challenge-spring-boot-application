package Code.challenge.spring.boot.application.services;

import Code.challenge.spring.boot.application.dao.RezerwacjaDAO;
import Code.challenge.spring.boot.application.models.Obiekt;
import Code.challenge.spring.boot.application.models.Rezerwacja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezerwacjaService {

    private final RezerwacjaDAO rezerwacjaDAO;

    @Autowired
    public RezerwacjaService(RezerwacjaDAO rezerwacjaDAO) {
        this.rezerwacjaDAO = rezerwacjaDAO;
    }

    //todo nie może być dwóch rezerwacji tego samego obiektu jednocześnie
    public void dodacRezerwacje(Rezerwacja rezerwacja) {
        rezerwacjaDAO.save(rezerwacja);
    }

    //todo tu też
    public void zmienicRezerwacje(Rezerwacja nowaRezerwacja) {
        rezerwacjaDAO.save(nowaRezerwacja);
    }

    public List<Rezerwacja> pobracRezerwacjiDlaNajemce(String nazwaNajemcy) {
        return rezerwacjaDAO.showAllByNajemca(nazwaNajemcy);
    }

    public List<Rezerwacja> pobracListeDlaObiektu(Long id) {
        return rezerwacjaDAO.showAllByObiekt(id);
    }
}
