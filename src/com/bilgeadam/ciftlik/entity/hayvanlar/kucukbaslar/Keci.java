package com.bilgeadam.ciftlik.entity.hayvanlar.kucukbaslar;

public class Keci extends KucukbasHayvanlar {
    public Keci(double yillikGetirisi, int hayvanSayisi, double yillikOtMasrafi) {
        super(yillikGetirisi, hayvanSayisi, yillikOtMasrafi);
    }

    @Override
    public void otlariniVer() {
        System.out.println("Keçilere ot verildi");
    }

    @Override
    public void sutleriniSag() {
        System.out.println("Keçilerin sütleri sağıldı");
    }

    @Override
    public void besle() {
        System.out.println("Keçiler beslendi");
    }

    @Override
    public String toString() {
        return "Keci{} " + super.toString();
    }
}
