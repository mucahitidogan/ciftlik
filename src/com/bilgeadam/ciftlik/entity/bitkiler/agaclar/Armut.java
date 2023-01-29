package com.bilgeadam.ciftlik.entity.bitkiler.agaclar;

public class Armut extends Agaclar{


    public Armut(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
                 double yillikToplamaMaaliyeti, double yillikKazancGetirisi, int yillikBudamaMaaliyeti) {
        super(yas, yillikVerimlilik, dikiliAlan, yillikGubreTuketimi, yillikSuTuketimi, yillikToplamaMaaliyeti, yillikKazancGetirisi, yillikBudamaMaaliyeti);
    }

    @Override
    public void buda() {
        System.out.println("Bi");
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
        return "Armut{} " + super.toString();
    }
}
