/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilih2;
        // TODO code application logic here
        do {
            System.out.flush();
            System.out.println("Menu Menghitung Volume Luas Permukaan Balok dan Tabung");
            System.out.println("======================================================");
            System.out.println("Menu :");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Keluar");
            System.out.println("Masukan Pilihan :");
            int pilih = scanner.nextInt();
            switch (pilih) {
                case 1: {
                    System.out.println("Menu Hitung Balok");
                    System.out.print("Masukkan panjang balok: ");
                    double p = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double l = scanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double t = scanner.nextDouble();
                    persegipanjang persegi = new persegipanjang(p, l, t);
                    persegi.setpanjang(p);
                    persegi.setlebar(l);
                    persegi.settinggi(t);
                    System.out.println("Luas Persegi Panjang :" + persegi.hitungluas(p, l));
                    System.out.println("Keliling Persegi Panjang :" + persegi.hitungkeliling(p, l));
                    System.out.println("Volume Balok :" +  persegi.hitungvolume(p, l, t));
                    System.out.println("Luas Permukaan Balok :"+ persegi.hitungluasbdg(p, l, t));
                    break;

                }
                case 2: {
                    System.out.println("Menu Hitung Tabung");
                    System.out.println("Masukan Jari-jari Tabung: ");
                    double j = scanner.nextDouble();
                    System.out.println("Masukan Tinggi Tabung: ");
                    double t = scanner.nextDouble();
                    lingkaran bulat = new lingkaran(j, t);
                    bulat.setjari(j);
                    bulat.settinggi(t);
                    System.out.println("Luas Lingkaran :" + bulat.hitungluas(j));
                    System.out.println("Keliling Lingkaran :" + bulat.hitungkeliling(j));
                    System.out.println("Volume Tabung :"+bulat.hitungvolume(j, t));
                    System.out.println("Luas Permukaan Tabung :"+bulat.hitungluasbdg(j, t));

                    break;
                }
                case 3:{
                    System.exit(0);
                    break;
                }
                default :{
                    System.out.println("Menu Yang Anda Inputkan Tidak Tersedia ");
                break;}

            }
            System.out.println("Ingin Kembali Ke Menu?(1 == Ya / 0 == Tidak)");
             pilih2=scanner.nextInt();
        } while (pilih2==1);

    }
}
