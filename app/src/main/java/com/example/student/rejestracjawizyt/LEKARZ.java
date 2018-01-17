package com.example.student.rejestracjawizyt;

/**
 * Created by student on 2018-01-17.
 */

public class LEKARZ {
    public String getNazwa() {
        return nazwa;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public LEKARZ(String nazwa, String specjalizacja) {
        this.nazwa = nazwa;
        this.specjalizacja = specjalizacja;
    }

    private String nazwa;
    private String specjalizacja;
}
