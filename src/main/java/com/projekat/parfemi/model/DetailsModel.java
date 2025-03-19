package com.projekat.parfemi.model;

import com.projekat.parfemi.entity.Brend;
import com.projekat.parfemi.entity.Kategorija;
import com.projekat.parfemi.entity.Parfem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@Setter
@Getter
public class DetailsModel {
    private String naziv;
    private Brend brend;

    private String visokeNote;
    private String srednjeNote;
    private String niskeNote;

    public DetailsModel(Parfem parfem) {
        this.naziv = parfem.getNaziv();
        this.brend = parfem.getBrend();

        Kategorija kategorija = parfem.getKategorija();
        this.visokeNote = String.join(", ", kategorija.getVisokeNote());
        this.srednjeNote = String.join(", ", kategorija.getSrednjeNote());
        this.niskeNote = String.join(", ", kategorija.getNiskeNote());
    }
}
