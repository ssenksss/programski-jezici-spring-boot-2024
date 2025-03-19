package com.projekat.parfemi.repository;

import com.projekat.parfemi.entity.Parfem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ParfemRepository extends JpaRepository<Parfem, Integer> {

    List<Parfem> findAllByDeletedAtIsNull();
    Optional<Parfem> findByIdAndDeletedAtIsNull(Integer id);

    List<Parfem> findByNazivContainsAndDeletedAtIsNull(String naziv);

    // List<Parfemi> findByKategorijeId (Integer kategorija);
    // List<Parfemi> findByBrendId(Integer brend);


}