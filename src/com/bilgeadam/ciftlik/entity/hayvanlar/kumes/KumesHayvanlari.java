package com.bilgeadam.ciftlik.entity.hayvanlar.kumes;

import com.bilgeadam.ciftlik.entity.hayvanlar.Hayvan;

public abstract class KumesHayvanlari extends Hayvan {

    private double yillikKumesYemiMasrafi;

    public abstract void kümesYemiVer();
    public abstract void yumurtalariTopla();


    public KumesHayvanlari(double yillikGetirisi, int hayvanSayisi, double yillikKumesYemiMasrafi) {
        super(yillikGetirisi, hayvanSayisi);
        this.yillikKumesYemiMasrafi = yillikKumesYemiMasrafi;
    }

    public double getYillikKumesYemiMasrafi() {
        return yillikKumesYemiMasrafi;
    }

    public void setYillikKumesYemiMasrafi(double yillikKumesYemiMasrafi) {
        this.yillikKumesYemiMasrafi = yillikKumesYemiMasrafi;
    }

    @Override
    public String toString() {
        return "KumesHayvanlari{" +
                "yillikKumesYemiMasrafi=" + yillikKumesYemiMasrafi +
                "} " + super.toString();
    }
}
