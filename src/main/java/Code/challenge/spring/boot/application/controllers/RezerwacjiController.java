package Code.challenge.spring.boot.application.controllers;

import Code.challenge.spring.boot.application.models.Rezerwacja;
import Code.challenge.spring.boot.application.models.RezerwacjaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rezerwacji")
public class RezerwacjiController {

    private final RezerwacjaRepo rezerwacjaRepo;

    @Autowired
    public RezerwacjiController(RezerwacjaRepo rezerwacjaRepo) {
        this.rezerwacjaRepo = rezerwacjaRepo;
    }

    @GetMapping
    public List<Rezerwacja> showAll() {
        return rezerwacjaRepo.findAll();
    }

    @GetMapping("/najemca/{nazwa}")
    public List<Rezerwacja> showAll(@PathVariable String nazwa) {
        return rezerwacjaRepo.findAllByNajemca_Nazwa(nazwa);
    }

    @GetMapping("/obiekt/{id}")
    public List<Rezerwacja> showAll(@PathVariable Long id) {
        return rezerwacjaRepo.findAllByObiekt_Id(id);
    }

    @PostMapping
    public void create(@RequestBody Rezerwacja rezerwacja) {
        rezerwacjaRepo.save(rezerwacja);
    }

    @PatchMapping("/{id}")
    public void update (@RequestBody Rezerwacja rezerwacja) {
        rezerwacjaRepo.save(rezerwacja);
    }
}
