package com.bilgeadam.ciftlik.entity.hayvanlar.kucukbaslar;

public class Koyun extends KucukbasHayvanlar {


    public Koyun(double yillikGetirisi, int hayvanSayisi, double yillikOtMasrafi) {
        super(yillikGetirisi, hayvanSayisi, yillikOtMasrafi);
    }

    @Override
    public void otlariniVer() {
        System.out.println("Koyunlara ot verildi");
    }

    @Override
    public void sutleriniSag() {
        System.out.println("Koyunlarin sütleri sağıldı");
    }

    @Override
    public void besle() {
        System.out.println("Koyunlar beslendi");
    }

    @Override
    public String toString() {
        return "Koyun{} " + super.toString();
    }
}
