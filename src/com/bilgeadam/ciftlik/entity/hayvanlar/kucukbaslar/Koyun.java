package com.bilgeadam.ciftlik.entity.hayvanlar.kucukbaslar;

public class Koyun extends KucukbasHayvanlar {
    public Koyun(int kilo, int uzunluk, double yillikGetirisi, double yillikOtMasrafi) {
        super(kilo, uzunluk, yillikGetirisi, yillikOtMasrafi);
    }

    @Override
    public String toString() {
        return "Koyun{} " + super.toString();
    }
}
