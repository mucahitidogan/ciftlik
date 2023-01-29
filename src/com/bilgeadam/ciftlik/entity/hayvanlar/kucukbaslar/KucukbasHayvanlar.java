package com.bilgeadam.ciftlik.entity.hayvanlar.kucukbaslar;

import com.bilgeadam.ciftlik.entity.hayvanlar.Hayvan;

public class KucukbasHayvanlar extends Hayvan {

    private double yillikOtMasrafi;

    public KucukbasHayvanlar(int kilo, int uzunluk, double yillikGetirisi, double yillikOtMasrafi) {
        super(kilo, uzunluk, yillikGetirisi);
        this.yillikOtMasrafi = yillikOtMasrafi;
    }

    public double getYillikOtMasrafi() {
        return yillikOtMasrafi;
    }

    public void setYillikOtMasrafi(double yillikOtMasrafi) {
        this.yillikOtMasrafi = yillikOtMasrafi;
    }

    @Override
    public String toString() {
        return "KucukbasHayvanlar{" +
                "yillikOtMasrafi=" + yillikOtMasrafi +
                "} " + super.toString();
    }
}
