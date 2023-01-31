package com.bilgeadam.ciftlik.entity.bitkiler.tarim;

public class Biber extends TarimBitkileri{

    public Biber(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
                 double yillikToplamaMaaliyeti, double yillikKazancGetirisi, int yillikDikimMaaliyeti) {
        super(yas, yillikVerimlilik, dikiliAlan, yillikGubreTuketimi, yillikSuTuketimi, yillikToplamaMaaliyeti, yillikKazancGetirisi, yillikDikimMaaliyeti);
    }

    @Override
    public void sok() {
        System.out.println("Biber söküldü");
    }

    @Override
    public void ek() {
        System.out.println("Biber ekildi");
    }

    @Override
    public void sula() {
        System.out.println("Biber sulandı");
    }

    @Override
    public void gubreVer() {
        System.out.println("Biber gübrelendi");
    }

    @Override
    public void topla() {
        System.out.println("Biber toplandı");
    }

    @Override
    public void sat() {
        System.out.println("Biber satıldı");
    }

    @Override
    public String toString() {
        return "Biber{} " + super.toString();
    }
}
