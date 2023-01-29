package com.bilgeadam.ciftlik.entity.bitkiler.agaclar;

public class Portakal extends Agaclar{


    public Portakal(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
                    double yillikToplamaMaaliyeti, double yillikKazancGetirisi, int yillikBudamaMaaliyeti) {
        super(yas, yillikVerimlilik, dikiliAlan, yillikGubreTuketimi, yillikSuTuketimi, yillikToplamaMaaliyeti, yillikKazancGetirisi, yillikBudamaMaaliyeti);
    }

    @Override
    public void buda() {

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
        return "Portakal{} " + super.toString();
    }
}
