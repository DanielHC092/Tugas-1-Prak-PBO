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
public class tabung extends lingkaran implements menghitungruang {

    double tinggi;

    tabung(double jari,  double tinggi) {
        super(jari, tinggi);
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
      double volume=Math.PI*jari*jari*tinggi;
        return volume;
    }

    @Override
    public double hitungluasbdg() {
        double luasbdg= (2*Math.PI*jari*tinggi)+(2*Math.PI*jari*jari);
        return luasbdg;
    }
    @Override
    public double hitungvolume(double j, double t) {
      double volume=2*(Math.PI*jari*tinggi);
        return volume;  
    }
    @Override
    public double hitungluasbdg (double j, double t) {
      double luasbdg= (2*Math.PI*jari*tinggi)+(2*Math.PI*jari*jari);
        return luasbdg;
    }

}
