package com.projekat.parfemi.service;

import com.projekat.parfemi.entity.Brend;
import com.projekat.parfemi.repository.BrendRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BrendService {

    private final BrendRepository repository;

    public List<Brend> getAllBrendovi() {
        return repository.findAllByDeletedAtIsNull();
    }

    public Optional<Brend> getBrendById(Integer id) {
        return repository.findByIdAndDeletedAtIsNull(id);
    }

    public Optional<Brend> getBrendByIme(String ime) {
        return repository.findByImeContainsAndDeletedAtIsNull(ime);
    }

    public List<Brend> getBrendByZemljaPorekla(String zemljaPorekla) {
        return repository.findByZemljaPoreklaAndDeletedAtIsNull(zemljaPorekla);
    }

    public Brend createBrend(Brend brend) {
        brend.setId(null);
        brend.setCreatedAt(LocalDateTime.now());
        return repository.save(brend);
    }

    public Brend updateBrend(Integer id, Brend brend) {
        brend.setId(id);
        brend.setUpdatedAt(LocalDateTime.now());
        return repository.save(brend);
    }

    public void deletedBrend(Integer id) {
        Brend brend = repository.findByIdAndDeletedAtIsNull(id).orElseThrow();
        brend.setDeletedAt(LocalDateTime.now());
        repository.save(brend);
    }



}