package com.bilgeadam.ciftlik.entity.hayvanlar.buyukbaslar;

public class At extends BuyukbasHayvanlar{
    public At(int kilo, int uzunluk, double yillikGetirisi, double yillikSamanMasrafi, double yillikYemMasrafi) {
        super(kilo, uzunluk, yillikGetirisi, yillikSamanMasrafi, yillikYemMasrafi);
    }

    @Override
    public String toString() {
        return "At{} " + super.toString();
    }
}
