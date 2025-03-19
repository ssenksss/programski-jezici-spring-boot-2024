package com.projekat.parfemi.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "kategorija")
@NoArgsConstructor
@Getter
@Setter

public class Kategorija {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kategorija_id")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Pol pol;

    @Column(name = "visoke_note", nullable = false)
    private String visokeNote;

    @Column(name = "srednje_note", nullable = false)
    private String srednjeNote;

    @Column(name = "niske_note", nullable = false)
    private String niskeNote;


    @Column(nullable = false)
    private LocalDateTime createdAt= LocalDateTime.now();;

    private LocalDateTime updatedAt;
    @JsonIgnore
    private LocalDateTime deletedAt;
    public enum Pol {
        ŽENSKI, MUŠKI, UNISEX;
    }
}