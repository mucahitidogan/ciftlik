package com.bilgeadam.ciftlik.entity.hayvanlar.kumes;

public class Tavuk extends KumesHayvanlari{
    public Tavuk(int kilo, int uzunluk, double yillikGetirisi, double yillikKumesYemiMasrafi) {
        super(kilo, uzunluk, yillikGetirisi, yillikKumesYemiMasrafi);
    }

    @Override
    public String toString() {
        return "Tavuk{} " + super.toString();
    }
}
