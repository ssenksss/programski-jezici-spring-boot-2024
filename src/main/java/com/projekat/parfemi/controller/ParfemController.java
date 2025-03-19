package com.projekat.parfemi.controller;
import com.projekat.parfemi.entity.Parfem;
import com.projekat.parfemi.model.ParfemiModel;

import com.projekat.parfemi.service.ParfemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/parfem")
@RequiredArgsConstructor
@CrossOrigin

public class ParfemController {

    private final ParfemService service;

    @GetMapping
    public List<Parfem> getAllParfemi() {
        return service.getAllParfemi();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Parfem> getParfemiById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getParfemiById(id));
    }

    @GetMapping(path = "/naziv/{naziv}")
    public List<Parfem>getParfemiByNaziv (@PathVariable String naziv) {
        return service.getParfemiByNaziv(naziv);
    }

    @PostMapping
    public Parfem createParfemi(@RequestBody ParfemiModel parfem) {
        return service.createParfemi(parfem);
    }

    @PutMapping(path = "/{id}")
    public Parfem updateParfemi(@PathVariable Integer id, @RequestBody ParfemiModel parfem) {
        System.out.println(parfem);
        return service.updateParfemi(id, parfem);
    }
    @DeleteMapping (path = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deletedParfemi(@PathVariable Integer id) {
        service.deletedParfemi(id);
    }


}