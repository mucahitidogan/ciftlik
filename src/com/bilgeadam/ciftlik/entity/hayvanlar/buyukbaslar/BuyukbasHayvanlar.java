package com.bilgeadam.ciftlik.entity.hayvanlar.buyukbaslar;

import com.bilgeadam.ciftlik.entity.hayvanlar.Hayvan;

public abstract class BuyukbasHayvanlar extends Hayvan {

    private double yillikSamanMasrafi;
    private double yillikYemMasrafi;

    public abstract void samanVer();
    public abstract void yemVer();


    public BuyukbasHayvanlar(double yillikGetirisi, int hayvanSayisi, double yillikSamanMasrafi, double yillikYemMasrafi) {
        super(yillikGetirisi, hayvanSayisi);
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
