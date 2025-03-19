package com.projekat.parfemi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "brend")
@NoArgsConstructor
@Getter
@Setter

public class Brend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brend_id")
    private Integer id;

    @Column(nullable = false)
    private String ime;

    @Column(name = "zemlja_porekla", nullable = false)
    private String zemljaPorekla;


    @Column(nullable = false)
    private LocalDateTime createdAt= LocalDateTime.now();;

    private LocalDateTime updatedAt;
    @JsonIgnore
    private LocalDateTime deletedAt;
}
