package com.bilgeadam.ciftlik.entity.bitkiler.agaclar;

public class Elma extends Agaclar{
    public Elma(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
                double yillikToplamaMaaliyeti, double yillikKazancGetirisi, int yillikBudamaMaaliyeti) {
        super(yas, yillikVerimlilik, dikiliAlan, yillikGubreTuketimi, yillikSuTuketimi, yillikToplamaMaaliyeti, yillikKazancGetirisi, yillikBudamaMaaliyeti);
    }

    @Override
    public void buda() {
        System.out.println("Elma budandı");
    }

    @Override
    public void ek() {
        System.out.println("Elma ekildi");
    }

    @Override
    public void sula() {
        System.out.println("Elma sulandı");
    }

    @Override
    public void gubreVer() {
        System.out.println("Elma gübrelendi");
    }

    @Override
    public void topla() {
        System.out.println("Elma toplandı");
    }

    @Override
    public void sat() {
        System.out.println("Elma satıldı");
    }

    @Override
    public String toString() {
        return "Elma{} " + super.toString();
    }
}
