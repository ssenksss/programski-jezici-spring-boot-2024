package com.projekat.parfemi.model;

import com.projekat.parfemi.entity.Brend;
import com.projekat.parfemi.entity.Kategorija;
import com.projekat.parfemi.entity.Parfem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ParfemiModel {
    private String naziv;
    private Brend  brend;
    private Kategorija.Pol kategorija; // Koristi enum umesto Kategorije objekta

    public ParfemiModel(Parfem parfem) {
        this.naziv = parfem.getNaziv();
        this.brend = parfem.getBrend();
        this.kategorija = parfem.getKategorija().getPol(); // Pretvori Kategorije objekat u enum Pol
    }

}
