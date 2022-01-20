package Code.challenge.spring.boot.application.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface RezerwacjaRepo extends JpaRepository<Rezerwacja, Long> {
    List<Rezerwacja> findAllByNajemca_Nazwa(String nazwa);
    List<Rezerwacja> findAllByObiekt_Id(Long id);

    @Query(value = "select count(poczatek) from rezerwacja where obiekt_id = ? and poczatek between ? and ?",
    nativeQuery = true)
    int findAllPoczatek(long id, Date start, Date end);

    @Query (value = "select count(koniec) from rezerwacja where obiekt_id = ? and koniec between ? and ?",
    nativeQuery = true)
    int findAllKoniec(long id, Date start, Date end);
}
