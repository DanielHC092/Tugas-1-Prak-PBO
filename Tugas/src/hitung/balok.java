/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

/**
 *
 * @author LENOVO
 */
public class balok extends persegipanjang implements menghitungruang {

    double tinggi;

    balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungvolume() {
        double volume = panjang * lebar * tinggi;
        return volume;
    }

    @Override
    public double hitungluasbdg() {
        double luasbdg = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return luasbdg;
    }
    @Override
    public double hitungvolume(double p,double l, double t) {
        double volume = panjang * lebar * tinggi;
        return volume;
    }
    @Override
    public double hitungluasbdg (double p,double l, double t) {
       double luasbdg = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
       return luasbdg;
    }

}
