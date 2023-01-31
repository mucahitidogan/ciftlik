package com.bilgeadam.ciftlik.entity.hayvanlar;

public abstract class Hayvan {

    private double yillikGetirisi;
    private int hayvanSayisi;

    public abstract void besle();

    public Hayvan(double yillikGetirisi, int hayvanSayisi) {
        this.yillikGetirisi = yillikGetirisi;
        this.hayvanSayisi = hayvanSayisi;
    }

    public double getYillikGetirisi() {
        return yillikGetirisi;
    }

    public void setYillikGetirisi(double yillikGetirisi) {
        this.yillikGetirisi = yillikGetirisi;
    }

    public int getHayvanSayisi() {
        return hayvanSayisi;
    }

    public void setHayvanSayisi(int hayvanSayisi) {
        this.hayvanSayisi = hayvanSayisi;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "yillikGetirisi=" + yillikGetirisi +
                ", hayvanSayisi=" + hayvanSayisi +
                '}';
    }
}
