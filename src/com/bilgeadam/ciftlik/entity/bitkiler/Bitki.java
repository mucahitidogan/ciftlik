package com.bilgeadam.ciftlik.entity.bitkiler;

public abstract class Bitki {

    private int yas;
    private int yillikVerimlilik;
    private int dikiliAlan;
    private double yillikGubreTuketimi;
    private double yillikSuTuketimi;
    private double yillikToplamaMaaliyeti;
    private double yillikKazancGetirisi;

    public abstract void ek();
    public abstract void sula();
    public abstract void gubreVer();
    public abstract void topla();
    public abstract void sat();

    public Bitki(int yas,int yillikVerimlilik, int dikiliAlan, double yillikGubreTuketimi, double yillikSuTuketimi) {
        this.yas=yas;
        this.yillikVerimlilik = yillikVerimlilik;
        this.dikiliAlan = dikiliAlan;
        this.yillikGubreTuketimi = yillikGubreTuketimi;
        this.yillikSuTuketimi = yillikSuTuketimi;
        this.yillikToplamaMaaliyeti = yillikGubreTuketimi + yillikSuTuketimi;
        this.yillikKazancGetirisi = yillikVerimlilik * dikiliAlan;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getYillikVerimlilik() {
        return yillikVerimlilik;
    }

    public void setYillikVerimlilik(int yillikVerimlilik) {
        this.yillikVerimlilik = yillikVerimlilik;
    }

    public int getDikiliAlan() {
        return dikiliAlan;
    }

    public void setDikiliAlan(int dikiliAlan) {
        this.dikiliAlan = dikiliAlan;
    }

    public double getYillikGubreTuketimi() {
        return yillikGubreTuketimi;
    }

    public void setYillikGubreTuketimi(double yillikGubreTuketimi) {
        this.yillikGubreTuketimi = yillikGubreTuketimi;
    }

    public double getYillikSuTuketimi() {
        return yillikSuTuketimi;
    }

    public void setYillikSuTuketimi(double yillikSuTuketimi) {
        this.yillikSuTuketimi = yillikSuTuketimi;
    }

    public double getYillikToplamaMaaliyeti() {
        return yillikToplamaMaaliyeti;
    }

    public void setYillikToplamaMaaliyeti(double yillikToplamaMaaliyeti) {
        this.yillikToplamaMaaliyeti = yillikToplamaMaaliyeti;
    }

    public double getYillikKazancGetirisi() {
        return yillikKazancGetirisi;
    }

    public void setYillikKazancGetirisi(double yillikKazancGetirisi) {
        this.yillikKazancGetirisi = yillikKazancGetirisi;
    }

    @Override
    public String toString() {
        return "Bitki{" +
                "yas=" + yas +
                ", yillikVerimlilik=" + yillikVerimlilik +
                ", dikiliAlan=" + dikiliAlan +
                ", yillikGubreTuketimi=" + yillikGubreTuketimi +
                ", yillikSuTuketimi=" + yillikSuTuketimi +
                ", yillikToplamaMaaliyeti=" + yillikToplamaMaaliyeti +
                ", yillikKazancGetirisi=" + yillikKazancGetirisi +
                '}';
    }
}
