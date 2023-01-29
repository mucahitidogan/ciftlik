package com.bilgeadam.ciftlik.entity.bitkiler.tarim;

import com.bilgeadam.ciftlik.entity.bitkiler.Bitki;

public abstract class TarimBitkileri extends Bitki {

    private int yillikDikimMaaliyeti;

    public abstract void sok();

    public TarimBitkileri(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
                          double yillikToplamaMaaliyeti, double yillikKazancGetirisi, int yillikDikimMaaliyeti) {
        super(yas, yillikVerimlilik, dikiliAlan, yillikGubreTuketimi, yillikSuTuketimi);
        this.yillikDikimMaaliyeti = yillikDikimMaaliyeti;
    }

    public int getYillikDikimMaaliyeti() {
        return yillikDikimMaaliyeti;
    }

    public void setYillikDikimMaaliyeti(int yillikDikimMaaliyeti) {
        this.yillikDikimMaaliyeti = yillikDikimMaaliyeti;
    }

    @Override
    public String toString() {
        return "TarimBitkileri{" +
                "yillikDikimMaaliyeti=" + yillikDikimMaaliyeti +
                "} " + super.toString();
    }
}
