package com.bilgeadam.ciftlik.entity.bitkiler.agaclar;

public class Portakal extends Agaclar{


    public Portakal(int yas, int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi,
                    double yillikToplamaMaaliyeti, double yillikKazancGetirisi, int yillikBudamaMaaliyeti) {
        super(yas, yillikVerimlilik, dikiliAlan, yillikGubreTuketimi, yillikSuTuketimi, yillikToplamaMaaliyeti, yillikKazancGetirisi, yillikBudamaMaaliyeti);
    }

    @Override
    public void buda() {
        System.out.println("Portakal budandı");
    }

    @Override
    public void ek() {
        System.out.println("Portakal ekildi");
    }

    @Override
    public void sula() {
        System.out.println("Portakal sulandı");
    }

    @Override
    public void gubreVer() {
        System.out.println("Portakal gübrelendi");
    }

    @Override
    public void topla() {
        System.out.println("Portakal toplandı");
    }

    @Override
    public void sat() {
        System.out.println("Portakal satıldı");
    }

    @Override
    public String toString() {
        return "Portakal{} " + super.toString();
    }
}
