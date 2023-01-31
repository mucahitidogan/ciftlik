package com.bilgeadam.ciftlik.entity.hayvanlar.buyukbaslar;

public class Inek extends BuyukbasHayvanlar{


    public Inek(double yillikGetirisi, int hayvanSayisi, double yillikSamanMasrafi, double yillikYemMasrafi) {
        super(yillikGetirisi, hayvanSayisi, yillikSamanMasrafi, yillikYemMasrafi);
    }

    public void sutunuSag() {
        System.out.println("İneğin sütü verildi");
    }

    @Override
    public void samanVer() {
        System.out.println("İneğe saman verildi");
    }

    @Override
    public void yemVer() {
        System.out.println("İneğe yem verildi");
    }

    @Override
    public void besle() {
        System.out.println("İnek beslendi");
    }

    @Override
    public String toString() {
        return "Inek{} " + super.toString();
    }
}
