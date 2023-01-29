package com.bilgeadam.ciftlik.entity.hayvanlar.buyukbaslar;

public class Inek extends BuyukbasHayvanlar{
    public Inek(int kilo, int uzunluk, double yillikGetirisi, double yillikSamanMasrafi, double yillikYemMasrafi) {
        super(kilo, uzunluk, yillikGetirisi, yillikSamanMasrafi, yillikYemMasrafi);
    }

    @Override
    public String toString() {
        return "Inek{} " + super.toString();
    }
}
