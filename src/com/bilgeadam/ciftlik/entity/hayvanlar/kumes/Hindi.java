package com.bilgeadam.ciftlik.entity.hayvanlar.kumes;

public class Hindi extends KumesHayvanlari {


    public Hindi(double yillikGetirisi, int hayvanSayisi, double yillikKumesYemiMasrafi) {
        super(yillikGetirisi, hayvanSayisi, yillikKumesYemiMasrafi);
    }

    @Override
    public void kümesYemiVer() {
        System.out.println("Hindilere kümes yemi verildi");
    }

    @Override
    public void yumurtalariTopla() {
        System.out.println("Hindilerin yumurtaları toplandı");
    }

    @Override
    public void besle() {
        System.out.println("Hindiler beslendi");
    }

    @Override
    public String toString() {
        return "Hindi{} " + super.toString();
    }
}
