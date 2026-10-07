package Pertemuan7;

import java.util.Scanner;

public class studiKasus125 {

    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        int hargaPerCup = 16000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.println("masukan jumlah cup");
        jumlahCup = rafif.nextInt();
        System.out.println("masukan jumlah uang");
        uangBayar = rafif.nextInt();

       totalHarga = jumlahCup * hargaPerCup;
       diskon = 0;

       if (totalHarga >= 10000) {
           diskon = totalHarga * 6/100;
       }

           totalBayar = totalHarga - diskon;
           System.out.println("total harga bayar - Rp "+ totalHarga);
           System.out.println("diskon = "+ diskon);
           System.out.println("totalBayar - Rp" + totalBayar);

        if (uangBayar >= totalBayar ) {
            kembalian = uangBayar - totalBayar;
            System.out.println("uang kembalian - Rp" + kembalian);
        }else {
            kurang = totalBayar - uangBayar;
            System.out.println("uang tidak cukup , kurang Rp" + kurang);

        

        }
        
    }

    }
