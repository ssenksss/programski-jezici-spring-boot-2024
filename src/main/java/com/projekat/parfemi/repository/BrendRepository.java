package com.projekat.parfemi.repository;

import com.projekat.parfemi.entity.Brend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BrendRepository extends JpaRepository<Brend, Integer> {

    Optional<Brend> findBrendByIme(String ime);

    List<Brend> findAllByDeletedAtIsNull();
    Optional<Brend> findByIdAndDeletedAtIsNull(Integer id);

    Optional<Brend> findByImeContainsAndDeletedAtIsNull(String ime);
    List<Brend> findByZemljaPoreklaAndDeletedAtIsNull(String zemljaPorekla);

    // public Optional<Brend> findByIme(String ime);
    //public Optional<Brend> findByZemljaPorekla(String zemljaPorekla);
}