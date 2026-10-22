package Pertemuan7;

import java.util.Scanner;

public class cobaMesinMinuman_25 {
    public static void main(String[] args) {
        Scanner rafif = new Scanner(System.in);
        int kode, harga = 0, jumlahCup, totalHarga;
        String jenisMinuman="";

        System.out.println("=== Mesin minuman otomatis JTI ===");
        System.out.println("1\\. Cappuccino (Rp18.000)");
        System.out.println("2\\. Matcha Latte (Rp20.000)");
        System.out.println("3\\. Oat Milk Tea (Rp15.000)");
        System.out.print("Pilih kode minuman (1-3): ");
        kode = rafif.nextInt();

        switch (kode) {
            case 1:
                jenisMinuman = "Cappucino";
                harga = 18000;
                break;
            case 2:
                jenisMinuman = "Matcha Latte";
                harga = 20000;
                break;
            case 3:
                jenisMinuman = "Oat Milk Tea";
                harga = 15000;
                break;
            default:
                System.out.println("Menu tidak tersedia");
                return;
                }
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = rafif.nextInt();
        
        totalHarga = jumlahCup * harga;
        System.out.println("--- Detail pesanan ---");
        System.out.println("Minuman: " + jenisMinuman);
        System.out.println("Jumlah pesanan: " + jumlahCup);
        System.out.println("TOTAL HARGA: " + totalHarga);
        
        if (totalHarga > 50000) {
            System.out.println("Selamat! Anda mendapat voucer cashback sebesar Rp5.000");
        } else {
            System.out.println("Anda tidak mendapatkan cashback");
        }
        
    }
    
}
