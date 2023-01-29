package com.bilgeadam.ciftlik.entity.hayvanlar.kumes;

public class Hindi extends KumesHayvanlari {
    public Hindi(int kilo, int uzunluk, double yillikGetirisi, double yillikKumesYemiMasrafi) {
        super(kilo, uzunluk, yillikGetirisi, yillikKumesYemiMasrafi);
    }

    @Override
    public String toString() {
        return "Hindi{} " + super.toString();
    }
}
