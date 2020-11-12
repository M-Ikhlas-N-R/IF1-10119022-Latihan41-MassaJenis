package com.minr;

public class Kubus {
    private int sisi, massa;

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getSisi() {
        return sisi;
    }

    public int getMassa() {
        return massa;
    }

    public int hitungVolume(int parSisi){
        return parSisi * parSisi * parSisi;
    }

    public int hitungMassaJenis(int parMassa, int volume){
        return parMassa/volume;
    }
}
