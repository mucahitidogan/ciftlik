package com.bilgeadam.ciftlik.entity.bitkiler.tarim;

import com.bilgeadam.ciftlik.entity.bitkiler.agaclar.Agaclar;

public class Domates extends TarimBitkileri {

    public Domates(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
                   double yillikToplamaMaaliyeti, double yillikKazancGetirisi, int yillikDikimMaaliyeti) {
        super(yas, yillikVerimlilik, dikiliAlan, yillikGubreTuketimi, yillikSuTuketimi, yillikToplamaMaaliyeti, yillikKazancGetirisi, yillikDikimMaaliyeti);
    }

    @Override
    public void sok() {
        System.out.println("Domates söküldü");
    }

    @Override
    public void ek() {
        System.out.println("Domates ekildi");
    }

    @Override
    public void sula() {
        System.out.println("Domates sulandı");
    }

    @Override
    public void gubreVer() {
        System.out.println("Domates gübrelendi");
    }

    @Override
    public void topla() {
        System.out.println("Domates toplandı");
    }

    @Override
    public void sat() {
        System.out.println("Domates satıldı");
    }

    @Override
    public String toString() {
        return "Domates{} " + super.toString();
    }
}
