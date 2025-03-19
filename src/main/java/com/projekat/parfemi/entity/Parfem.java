package com.projekat.parfemi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "parfem")
@NoArgsConstructor
@Getter
@Setter

public class Parfem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parfem_id")
    private Integer id;


    @Column(nullable = false)
    private String naziv;

    @ManyToOne(optional = false)
    @JoinColumn(name = "kategorija_id", nullable = false)
    private Kategorija kategorija;

    @ManyToOne(optional = false)
    @JoinColumn(name = "brend_id", nullable = false)
    private Brend brend;


    @Column(nullable = false)
    private LocalDateTime createdAt= LocalDateTime.now();

    private LocalDateTime updatedAt;
    @JsonIgnore
    private LocalDateTime deletedAt;

}