package Code.challenge.spring.boot.application.models;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RezerwacjaRepo extends JpaRepository<Rezerwacja, Long> {
    List<Rezerwacja> findAllByNajemca_Nazwa(String nazwa);
    List<Rezerwacja> findAllByObiekt(Obiekt obiekt);
}
