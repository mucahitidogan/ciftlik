package com.bilgeadam.ciftlik.entity.hayvanlar.kumes;

import com.bilgeadam.ciftlik.entity.hayvanlar.Hayvan;

public class KumesHayvanlari extends Hayvan {

    private double yillikKumesYemiMasrafi;

    public KumesHayvanlari(int kilo, int uzunluk, double yillikGetirisi, double yillikKumesYemiMasrafi) {
        super(kilo, uzunluk, yillikGetirisi);
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
