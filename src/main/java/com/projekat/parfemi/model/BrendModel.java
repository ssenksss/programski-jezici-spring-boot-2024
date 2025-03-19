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
public class BrendModel {
    private String  ime;
    private String  zemljaPorekla;


    public BrendModel(Brend brend) {
        this.ime = brend.getIme();
        this.zemljaPorekla = brend.getZemljaPorekla();
    }
}
