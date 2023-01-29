package com.bilgeadam.ciftlik.entity.bitkiler.agaclar;

import com.bilgeadam.ciftlik.entity.bitkiler.Bitki;

public abstract class Agaclar extends Bitki{

    private int yillikBudamaMaaliyeti;

    public abstract void buda();

    public Agaclar(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
                   double yillikToplamaMaaliyeti, double yillikKazancGetirisi, int yillikBudamaMaaliyeti) {
        super(yas, yillikVerimlilik, dikiliAlan, yillikGubreTuketimi, yillikSuTuketimi);
        this.yillikBudamaMaaliyeti = yillikBudamaMaaliyeti;
    }

    public int getYillikBudamaMaaliyeti() {
        return yillikBudamaMaaliyeti;
    }

    public void setYillikBudamaMaaliyeti(int yillikBudamaMaaliyeti) {
        this.yillikBudamaMaaliyeti = yillikBudamaMaaliyeti;
    }

    @Override
    public String toString() {
        return "Agaclar{" +
                "yillikBudamaMaaliyeti=" + yillikBudamaMaaliyeti +
                "} " + super.toString();
    }
}
