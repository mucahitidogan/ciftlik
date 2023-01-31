package com.bilgeadam.ciftlik.entity.bitkiler.tarim;

import com.bilgeadam.ciftlik.entity.bitkiler.agaclar.Agaclar;

public class Salatalik extends TarimBitkileri {

    public Salatalik(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
                     double yillikToplamaMaaliyeti, double yillikKazancGetirisi, int yillikDikimMaaliyeti) {
        super(yas, yillikVerimlilik, dikiliAlan, yillikGubreTuketimi, yillikSuTuketimi, yillikToplamaMaaliyeti, yillikKazancGetirisi, yillikDikimMaaliyeti);
    }

    @Override
    public void sok() {
        System.out.println("Salatalık söküldü");
    }

    @Override
    public void ek() {
        System.out.println("Salatalık ekildi");
    }

    @Override
    public void sula() {
        System.out.println("Salatalık sulandı");
    }

    @Override
    public void gubreVer() {
        System.out.println("Salatalık gübrelendi");
    }

    @Override
    public void topla() {
        System.out.println("Salatalık toplandı");
    }

    @Override
    public void sat() {
        System.out.println("Salatalık satıldı");
    }

    @Override
    public String toString() {
        return "Salatalik{} " + super.toString();
    }
}
