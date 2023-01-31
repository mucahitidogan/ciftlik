package com.bilgeadam.ciftlik.entity.bitkiler.agaclar;

public class Armut extends Agaclar{


    public Armut(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
                 double yillikToplamaMaaliyeti, double yillikKazancGetirisi, int yillikBudamaMaaliyeti) {
        super(yas, yillikVerimlilik, dikiliAlan, yillikGubreTuketimi, yillikSuTuketimi, yillikToplamaMaaliyeti, yillikKazancGetirisi, yillikBudamaMaaliyeti);
    }

    @Override
    public void buda() {
        System.out.println("Armut budandı.");
    }

    @Override
    public void ek() {
        System.out.println("Armut ekildi");
    }

    @Override
    public void sula() {
        System.out.println("Armut sulandı");
    }

    @Override
    public void gubreVer() {
        System.out.println("Armut gübrelendi");
    }

    @Override
    public void topla() {
        System.out.println("Armut toplandı");
    }

    @Override
    public void sat() {
        System.out.println("Armut satıldı");
    }

    @Override
    public String toString() {
        return "Armut{} " + super.toString();
    }
}
