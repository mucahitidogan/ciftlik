package com.bilgeadam.ciftlik.entity.hayvanlar.kucukbaslar;

public class Keci extends KucukbasHayvanlar {
    public Keci(int kilo, int uzunluk, double yillikGetirisi, double yillikOtMasrafi) {
        super(kilo, uzunluk, yillikGetirisi, yillikOtMasrafi);
    }

    @Override
    public String toString() {
        return "Keci{} " + super.toString();
    }
}
