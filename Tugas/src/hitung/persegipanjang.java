/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

public class persegipanjang implements menghitungbidang {

    double panjang;
    double lebar;
    private double tinggi;
    private double luas;
    private double keliling;

    persegipanjang(double p, double l, double t) {
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }

    public double getpanjang() {
        return panjang;
    }

    void setpanjang(double p) {
        this.panjang = p;
    }

    public double getlebar() {
        return lebar;
    }

    void setlebar(double l) {
        this.lebar = l;
    }

    public double gettinggi() {
        return tinggi;
    }

    void settinggi(double t) {
        this.tinggi = t;
    }

    @Override
    public double hitungluas() {
        luas = lebar * panjang;
        return luas;
    }

    @Override
    public double hitungkeliling() {
        keliling = 2 * (panjang + lebar);
        return keliling;

    }

    public double hitungluas(double p, double l) {
        luas = lebar * panjang;
        return luas;
    }

    public double hitungkeliling(double p, double l) {
        keliling = 2 * (panjang + lebar);
        return keliling;

    }

    public double hitungvolume(double p, double l, double t) {
        double volume = panjang * lebar * tinggi;
        return volume;
    }

    public double hitungluasbdg(double p, double l, double t) {
        double luasbdg = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return luasbdg;
    }

}
