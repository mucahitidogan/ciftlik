package com.bilgeadam.ciftlik.entity.hayvanlar.buyukbaslar;

public class At extends BuyukbasHayvanlar{


    public At(double yillikGetirisi, int hayvanSayisi, double yillikSamanMasrafi, double yillikYemMasrafi) {
        super(yillikGetirisi, hayvanSayisi, yillikSamanMasrafi, yillikYemMasrafi);
    }

    @Override
    public void samanVer() {
        System.out.println("Ata saman verildi");
    }

    @Override
    public void yemVer() {
        System.out.println("Ata yem verildi");
    }

    @Override
    public void besle() {
        System.out.println("At beslendi");
    }

    @Override
    public String toString() {
        return "At{} " + super.toString();
    }
}
