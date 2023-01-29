package com.bilgeadam.ciftlik.entity.bitkiler.tarim;

import com.bilgeadam.ciftlik.entity.bitkiler.agaclar.Agaclar;

public class Domates extends TarimBitkileri {

    public Domates(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
                   double yillikToplamaMaaliyeti, double yillikKazancGetirisi, int yillikDikimMaaliyeti) {
        super(yas, yillikVerimlilik, dikiliAlan, yillikGubreTuketimi, yillikSuTuketimi, yillikToplamaMaaliyeti, yillikKazancGetirisi, yillikDikimMaaliyeti);
    }

    @Override
    public void sok() {

    }

    @Override
    public void ek() {

    }

    @Override
    public void sula() {

    }

    @Override
    public void gubreVer() {

    }

    @Override
    public void topla() {

    }

    @Override
    public void sat() {

    }

    @Override
    public String toString() {
        return "Domates{} " + super.toString();
    }
}
