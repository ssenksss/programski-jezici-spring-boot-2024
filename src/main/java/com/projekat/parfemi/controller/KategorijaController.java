package com.projekat.parfemi.controller;
import com.projekat.parfemi.entity.Kategorija;
import com.projekat.parfemi.service.KategorijaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/kategorija")
@RequiredArgsConstructor
@CrossOrigin

public class KategorijaController {


    private final KategorijaService service;


    @GetMapping
    public List<Kategorija> getAllKategorije() {
        return service.getAllKategorije();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Kategorija> getKategorijeById(@PathVariable Integer id) {
        return ResponseEntity.of(service.findById(id));
    }


    @GetMapping(path = "/pol/{pol}")
    public Optional<Kategorija> getKategorijeByPol(@PathVariable("pol") Kategorija.Pol pol) {
        return service.findByPol(pol);
    }

    @GetMapping(path = "/visokeNote/{visokeNote}")
    public List<Kategorija> getKategorijeByVisokeNote(@PathVariable String visokeNote) {
        return service.getKategorijeByVisokeNote(visokeNote);
    }

    @GetMapping(path = "/srednjeNote/{srednjeNote}")
    public List<Kategorija> getKategorijeBySrednjeNote(@PathVariable String srednjeNote) {
        return service.getKategorijeBySrednjeNote(srednjeNote);
    }

    @GetMapping(path = "/niskeNote/{niskeNote}")
    public List<Kategorija> getKategorijeByNiskeNote(@PathVariable String niskeNote) {
        return service.getKategorijeByNiskeNote(niskeNote);
    }

    @PostMapping
    public Kategorija createKategorije(@RequestBody Kategorija kategorija) {
        return service.createKategorije(kategorija);
    }

    @PutMapping(path = "/{id}")
    public Kategorija updateKategorije(@PathVariable Integer id, @RequestBody Kategorija kategorija) {
        return service.updateKategorije(id, kategorija);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deletedKategorije(@PathVariable Integer id) {
        service.deletedKategorije(id);
    }


}