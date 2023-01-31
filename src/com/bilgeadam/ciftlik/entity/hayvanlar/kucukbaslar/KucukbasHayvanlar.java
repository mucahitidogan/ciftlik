package com.bilgeadam.ciftlik.entity.hayvanlar.kucukbaslar;

import com.bilgeadam.ciftlik.entity.hayvanlar.Hayvan;

public abstract class KucukbasHayvanlar extends Hayvan {

    private double yillikOtMasrafi;

    public abstract void otlariniVer();
    public abstract void sutleriniSag();

    public KucukbasHayvanlar(double yillikGetirisi, int hayvanSayisi, double yillikOtMasrafi) {
        super(yillikGetirisi, hayvanSayisi);
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
