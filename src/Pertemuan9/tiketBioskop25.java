//harga tiket = 42.000 (25 mod 6)
//syarat diskon pertama = tiket > 4 diskon 8 %
//syarat diskon kedua = tiket > 9 diskon 16 %
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class tiketBioskop25 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        int hargaTiket = 42000 , tiket = 1, totalTiket = 0, harga, banyaknyaTransaksi = 0;
        double hargaAkhir, diskonTiket, totalHarga = 0;

        while (tiket != 0) {
            System.out.println("---Tiket Bioskop---");
            System.out.println("Masukan 0 untuk mengakhiri program");
            System.out.print("Jumlah tiket Bioskop: ");
            tiket = rafif.nextInt();
        

        if (tiket == 0) {
            System.out.println("Program penjualan tiket bioskop telah berakhir hari ini. ");
            break;
        }
        if (tiket <0) {
            System.out.println("Jumlah tiket tidak valid, silahkan ulangi inputnya.");
            continue;
        }
        harga = hargaTiket * tiket;
        diskonTiket = 0;
        double persentaseDiskon = 0;

        if (tiket > 9) {
            persentaseDiskon = 0.16;
            diskonTiket = harga * persentaseDiskon;
        }else if (tiket >4) {
            persentaseDiskon = 0.8;
            diskonTiket = harga * persentaseDiskon;
        }
        hargaAkhir = harga - diskonTiket;

        System.out.println("------------------------");
        System.out.println("Jumlah tiket : ");
        System.out.println("Harga per tiket : ");
        System.out.println("Total harga :Rp " + harga);

        if (diskonTiket > 0) {
          System.out.println("Diskon (" + (persentaseDiskon * 100) + "%)    -Rp " + diskonTiket);
        } else { 
            System.out.println("Diskon : - ");
        }
        System.out.println("Total bayar : Rp " + hargaAkhir);
        System.out.println("-----------------------");

        totalTiket += tiket ;
        totalHarga += hargaAkhir ;
        banyaknyaTransaksi++;
    }
    System.out.println("============================");
    System.out.println("Total harga hari ini: " + totalHarga);
    System.out.println("Total tiket yang terjual hari ini: " + totalTiket);
    System.out.println("Banyaknya transaksi hari ini: " + banyaknyaTransaksi);
    System.out.println("===========================");
    rafif.close();
   
    }

 }

