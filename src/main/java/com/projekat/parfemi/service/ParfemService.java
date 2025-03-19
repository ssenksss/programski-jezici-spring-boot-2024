package com.projekat.parfemi.service;

import com.projekat.parfemi.entity.Brend;
import com.projekat.parfemi.entity.Kategorija;
import com.projekat.parfemi.entity.Parfem;
import com.projekat.parfemi.model.ParfemiModel;

import com.projekat.parfemi.repository.BrendRepository;
import com.projekat.parfemi.repository.KategorijaRepository;
import com.projekat.parfemi.repository.ParfemRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class ParfemService {

    private final ParfemRepository repository;
    private final BrendRepository brendRepository;
    private final KategorijaRepository kategorijaRepository;

    public List<Parfem> getAllParfemi() {
        return repository.findAllByDeletedAtIsNull();
    }

    public Optional<Parfem> getParfemiById(Integer id) {
        return repository.findByIdAndDeletedAtIsNull(id);
    }

    public List<Parfem> getParfemiByNaziv(String naziv) {
        return repository.findByNazivContainsAndDeletedAtIsNull(naziv);
    }

    public Parfem createParfemi(ParfemiModel model) {
        Parfem parfem = new Parfem();
        parfem.setNaziv(model.getNaziv());

        Brend brend = brendRepository.findById(model.getBrend().getId()).orElseThrow();
        Kategorija.Pol pol = model.getKategorija();
        Kategorija kategorija = kategorijaRepository.findFirstByPolAndDeletedAtIsNull(pol).orElseThrow();

        parfem.setBrend(brend);
        parfem.setKategorija(kategorija);
        parfem.setCreatedAt(LocalDateTime.now());

        return repository.save(parfem);
    }

    public Parfem updateParfemi(Integer id, ParfemiModel model) {
        Parfem parfem = repository.findByIdAndDeletedAtIsNull(id).orElseThrow();

        Brend brend = brendRepository.findById(model.getBrend().getId()).orElseThrow();

        Kategorija.Pol pol = model.getKategorija();
        Kategorija kategorija = kategorijaRepository.findFirstByPolAndDeletedAtIsNull(pol).orElseThrow();

        parfem.setNaziv(model.getNaziv());
        parfem.setBrend(brend);
        parfem.setKategorija(kategorija);
        parfem.setUpdatedAt(LocalDateTime.now());

        return repository.save(parfem);
    }

    public void deletedParfemi(Integer id) {
        Parfem parfem = repository.findByIdAndDeletedAtIsNull(id).orElseThrow();

        parfem.setDeletedAt(LocalDateTime.now());
        repository.save(parfem);
    }
}
