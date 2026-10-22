 
 package Pertemuan7;

import java.util.Scanner;

public class cobaLaundryBaju_25 {
    public static void main(String[] args) {
        Scanner rafif = new Scanner(System.in);
        int tarifDsr, biayaTambahan = 3000, biayatetap = 2000, berattotal, biayaEkspres = 0;
        double diskon = 0.1, totalDiskon = 0, biayaAkhir=0, totalBayar=0;
        boolean expres; 
        String namaPelanggan;

        System.out.print("Nama pelanggan: ");
        namaPelanggan = rafif.nextLine();
        System.out.println("Berat cucian: ");
        berattotal = rafif.nextInt();
        System.out.println("Apakah layanan expres (true/false)");
        expres = rafif.nextBoolean();

        tarifDsr = berattotal * 7000;
        if (expres && berattotal > 10) {
            biayaEkspres = biayaTambahan * berattotal;
            biayaAkhir = biayaEkspres + tarifDsr + biayatetap;
            totalDiskon = biayaAkhir * diskon;
            totalBayar = biayaAkhir - totalDiskon;
        } else if (expres && berattotal <= 10) {
            biayaEkspres = biayaTambahan * berattotal;
            totalBayar = biayaEkspres + tarifDsr + biayatetap;
        } else if (berattotal > 10){
            biayaAkhir = tarifDsr + biayatetap;
            totalDiskon = biayaAkhir * diskon;
            totalBayar = biayaAkhir - totalDiskon;
        } else {
            totalBayar = tarifDsr + biayatetap;
            }

        System.out.println("pelanggan: " + namaPelanggan);
        System.out.println("tarif dasar: " + tarifDsr);
        System.out.println("biaya expres: " + biayaEkspres);
        System.out.println("diskon: " + totalDiskon);
        System.out.println("biaya kemasan: " + biayatetap);
        System.out.println("total bayar: " + totalBayar);
        
    }
    
}
