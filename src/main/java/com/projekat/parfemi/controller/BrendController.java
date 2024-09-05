package com.projekat.parfemi.controller;

import com.projekat.parfemi.entity.Brend;
import com.projekat.parfemi.service.BrendService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/brend")
@RequiredArgsConstructor
@CrossOrigin


public class BrendController {

    private final BrendService service;

    @GetMapping
    public List<Brend> getAllBrendovi() {
        return service.getAllBrendovi();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Brend> getBrendById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getBrendById(id));
    }
    @GetMapping(path = "/ime/{ime}")
    public Optional<Brend> getBrendByIme(@PathVariable String ime) {
        return service.getBrendByIme(ime);
    }

    @GetMapping(path = "/zemljaPorekla/{zemljaPorekla}")
    public List<Brend> getBrendByZemljaPorekla(@PathVariable String zemljaPorekla) {
        return service.getBrendByZemljaPorekla(zemljaPorekla);
    }


    @PostMapping
    public Brend createBrend(@RequestBody Brend brend) {
        return service.createBrend(brend);
    }

    @PutMapping(path = "/{id}")
    public Brend updateBrend(@PathVariable Integer id, @RequestBody Brend brend) {
        return service.updateBrend(id, brend);
    }
    @DeleteMapping (path = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deletedBrend(@PathVariable Integer id) {
        service.deletedBrend(id);
    }


}