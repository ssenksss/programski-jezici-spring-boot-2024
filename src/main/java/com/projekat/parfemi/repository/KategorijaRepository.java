package com.projekat.parfemi.repository;


import com.projekat.parfemi.entity.Kategorija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KategorijaRepository extends JpaRepository<Kategorija, Integer> {

    Optional<Kategorija> findFirstByPolAndDeletedAtIsNull(Kategorija.Pol pol);

    Optional<Kategorija> findByIdAndDeletedAtIsNull(Integer id);

    Optional<Kategorija> findByPolAndDeletedAtIsNull(Kategorija.Pol pol);
    List<Kategorija> findByVisokeNoteAndDeletedAtIsNull(String visokeNote);
    List<Kategorija> findBySrednjeNoteAndDeletedAtIsNull(String srednjeNote);
    List<Kategorija> findByNiskeNoteAndDeletedAtIsNull(String niskeNote);


}