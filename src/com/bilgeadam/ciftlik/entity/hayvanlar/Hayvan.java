package com.bilgeadam.ciftlik.entity.hayvanlar;

public class Hayvan {

    private int kilo;
    private int uzunluk;
    private double yillikGetirisi;
    private int hayvanSayisi;

    public Hayvan(int kilo, int uzunluk, double yillikGetirisi,int hayvanSayisi) {
        this.kilo = kilo;
        this.uzunluk = uzunluk;
        this.yillikGetirisi = yillikGetirisi;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public double getYillikGetirisi() {
        return yillikGetirisi;
    }

    public void setYillikGetirisi(double yillikGetirisi) {
        this.yillikGetirisi = yillikGetirisi;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "kilo=" + kilo +
                ", uzunluk=" + uzunluk +
                ", yillikGetirisi=" + yillikGetirisi +
                '}';
    }
}
