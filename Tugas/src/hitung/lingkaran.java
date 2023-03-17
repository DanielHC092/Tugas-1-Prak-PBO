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
public class lingkaran implements menghitungbidang {
    double jari;
    private double tinggi;
    
    lingkaran(double j, double t) {
        this.jari=j;
        this.tinggi=t;
    }

    public double getjari() {
        return jari;
    }
    void setjari(double j) {
        this.jari=j;
    }
    public double gettinggi(){
       return tinggi;
    }
    void settinggi(double t) {
        this.tinggi=t;
    }

    @Override
    public double hitungluas() {
        double luas= Math.PI * jari* jari;
        return luas;
    }

    @Override
    public double hitungkeliling() {
        double keliling= 2*Math.PI*jari;
        return keliling;
    }
     public double hitungluas(double j) {
        double luas= Math.PI * jari* jari;
        return luas;
    }
      public double hitungkeliling(double j) {
       double keliling= 2*Math.PI*jari;
        return keliling;
     
    }
    
      public double hitungvolume(double j, double t) {
      double volume=Math.PI*jari*jari*tinggi;
        return volume;  
    }
      public double hitungluasbdg (double j, double t) {
      double luasbdg= (2*Math.PI*jari*tinggi)+(2*Math.PI*jari*jari);
        return luasbdg;
    }
}
