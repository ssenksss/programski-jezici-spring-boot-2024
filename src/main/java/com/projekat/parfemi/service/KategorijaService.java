package com.projekat.parfemi.service;

import com.projekat.parfemi.entity.Kategorija;
import com.projekat.parfemi.repository.KategorijaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KategorijaService {

    private final KategorijaRepository repository;
    public Optional<Kategorija> findById(Integer id) {
        return repository.findById(id);
    }
    public List<Kategorija> getAllKategorije(){
        return repository.findAll();
    }
    public Optional<Kategorija> findByPol(Kategorija.Pol pol) {
        return repository.findByPolAndDeletedAtIsNull(pol);
    }
    public List<Kategorija> getKategorijeByVisokeNote(String visokeNote) {
        return repository.findByVisokeNoteAndDeletedAtIsNull(visokeNote);
    }
    public List<Kategorija> getKategorijeBySrednjeNote(String srednjeNote) {
        return repository.findBySrednjeNoteAndDeletedAtIsNull(srednjeNote);
    }
    public List<Kategorija> getKategorijeByNiskeNote(String niskeNote) {
        return repository.findByNiskeNoteAndDeletedAtIsNull(niskeNote);
    }

    public Kategorija createKategorije(Kategorija kategorija) {
        kategorija.setId(null);
        kategorija.setCreatedAt(LocalDateTime.now());
        return repository.save(kategorija);
    }

    public Kategorija updateKategorije(Integer id, Kategorija kategorija) {
        kategorija.setId(id);
        kategorija.setUpdatedAt(LocalDateTime.now());
        return repository.save(kategorija);
    }

    public void deletedKategorije(Integer id) {
        Kategorija kategorija = repository.findByIdAndDeletedAtIsNull(id).orElseThrow();
        kategorija.setDeletedAt(LocalDateTime.now());
        repository.save(kategorija);
    }

}