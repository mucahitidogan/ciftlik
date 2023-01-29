package com.bilgeadam.ciftlik.entity.bitkiler.tarim;

public class Biber extends TarimBitkileri{

    public Biber(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
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
        return "Biber{} " + super.toString();
    }
}
