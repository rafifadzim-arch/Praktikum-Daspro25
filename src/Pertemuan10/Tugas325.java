package Pertemuan10;

import java.util.Scanner;

public class Tugas325 {
    public static void main(String[] args) {
        Scanner rafif = new Scanner(System.in);

        int jumlahToko;

        do {
            System.out.print("Masukkan Jumlah Toko: ");
            jumlahToko = rafif.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah Toko Minimal 1. Ulangi Input!");
            }
        } while (jumlahToko < 1);

        
        int totalSeluruh = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;
        String ringkasan = "";

        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.println("Toko" + toko);

            int pelanggan;
            do {
                System.out.print(" Jumlah Pelanggan : ");
                pelanggan = rafif.nextInt();
                if (pelanggan < 0) {
                    System.out.println(" Tidak Boleh Negatif. Ulangi Input!");
                }
            } while (pelanggan < 0);

            int totalBarangToko = 0;
            for (int p = 1; p <= pelanggan; p++) {
                int barang;
                do {
                    System.out.print(" Jumlah Barang Pelanggan " + p + ": ");
                    barang = rafif.nextInt();
                    if (barang < 0) {
                        System.out.println("Tidak Boleh Negatif. Ulangi input!");
                    }
                } while (barang < 0);
                totalBarangToko += barang;
            }
            ringkasan += "Toko" + toko + " - pelanggan: " + pelanggan + " , total barang: " + totalBarangToko + "\n";
            totalSeluruh += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }
        System.out.println("==============================");
        System.out.print(ringkasan);
        System.out.println("Total barang seluruh toko: " + totalSeluruh);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        rafif.close();

    }

}
