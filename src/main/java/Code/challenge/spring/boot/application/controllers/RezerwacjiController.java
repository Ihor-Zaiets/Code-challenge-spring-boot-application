package Code.challenge.spring.boot.application.controllers;

import Code.challenge.spring.boot.application.models.Rezerwacja;
import Code.challenge.spring.boot.application.services.RezerwacjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rezerwacji")
public class RezerwacjiController {

    private final RezerwacjaService rezerwacjaService;

    @Autowired
    public RezerwacjiController(RezerwacjaService rezerwacjaService) {
        this.rezerwacjaService = rezerwacjaService;
    }

    @GetMapping
    public List<Rezerwacja> showAll() {
        return rezerwacjaService.showAll();
    }

    @GetMapping("/najemca/{nazwa}")
    public List<Rezerwacja> showAll(@PathVariable String nazwa) {
        return rezerwacjaService.findByNajemca(nazwa);
    }

    @GetMapping("/obiekt/{id}")
    public List<Rezerwacja> showAll(@PathVariable Long id) {
        return rezerwacjaService.findByObiekt(id);
    }

    @PostMapping
    public void create(@RequestBody Rezerwacja rezerwacja) {
        rezerwacjaService.save(rezerwacja);
    }

    @PatchMapping("/{id}")
    public void update ( @PathVariable Long id,
            @RequestBody Rezerwacja rezerwacja) {
        rezerwacja.setId(id);
        rezerwacjaService.save(rezerwacja);
    }
}
