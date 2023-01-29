package com.bilgeadam.ciftlik.entity.hayvanlar.buyukbaslar;

import com.bilgeadam.ciftlik.entity.hayvanlar.Hayvan;

public class BuyukbasHayvanlar extends Hayvan {

    private double yillikSamanMasrafi;
    private double yillikYemMasrafi;

    public BuyukbasHayvanlar(int kilo, int uzunluk, double yillikGetirisi, double yillikSamanMasrafi, double yillikYemMasrafi) {
        super(kilo, uzunluk, yillikGetirisi);
        this.yillikSamanMasrafi = yillikSamanMasrafi;
        this.yillikYemMasrafi = yillikYemMasrafi;
    }

    public double getYillikSamanMasrafi() {
        return yillikSamanMasrafi;
    }

    public void setYillikSamanMasrafi(double yillikSamanMasrafi) {
        this.yillikSamanMasrafi = yillikSamanMasrafi;
    }

    public double getYillikYemMasrafi() {
        return yillikYemMasrafi;
    }

    public void setYillikYemMasrafi(double yillikYemMasrafi) {
        this.yillikYemMasrafi = yillikYemMasrafi;
    }

    @Override
    public String toString() {
        return "BuyukbasHayvanlar{" +
                "yillikSamanMasrafi=" + yillikSamanMasrafi +
                ", yillikYemMasrafi=" + yillikYemMasrafi +
                "} " + super.toString();
    }
}
