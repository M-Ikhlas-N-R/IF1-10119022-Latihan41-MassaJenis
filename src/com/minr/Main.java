package com.minr;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program menghitung massa jenis Latihan 41
 *
 */
public class Main extends Kubus{
    public static void main(String[] args) {
        Main kubus1 = new Main();

        kubus1.setSisi(5);
        kubus1.setMassa(250);


        System.out.println("======Massa Jenis Kubus======");
        System.out.format("Sisi : %d \n", kubus1.getSisi());
        System.out.format("Massa : %d \n", kubus1.getMassa());
        System.out.println();
        System.out.println("======Hasil Perhitungan======");
        System.out.format("Volume : %d\n", kubus1.hitungVolume(kubus1.getSisi()));
        System.out.format("Massa : %d\n", kubus1.hitungMassaJenis(kubus1.getMassa(), kubus1.hitungVolume(kubus1.getSisi())) );
    }
}
