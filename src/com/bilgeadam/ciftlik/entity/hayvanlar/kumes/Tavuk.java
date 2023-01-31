package com.bilgeadam.ciftlik.entity.hayvanlar.kumes;

public class Tavuk extends KumesHayvanlari{
    public Tavuk(double yillikGetirisi, int hayvanSayisi, double yillikKumesYemiMasrafi) {
        super(yillikGetirisi, hayvanSayisi, yillikKumesYemiMasrafi);
    }

    @Override
    public void kümesYemiVer() {
        System.out.println("Tavuklara kümes yemi verildi");
    }

    @Override
    public void yumurtalariTopla() {
        System.out.println("Tavukların yumurtaları toplandı");
    }

    @Override
    public void besle() {
        System.out.println("Tavuklar beslendi");
    }

    @Override
    public String toString() {
        return "Tavuk{} " + super.toString();
    }
}
