package Pertemuan3.Pertemuan5;

import java.util.Scanner;

public class Tugas1Pemilihan25 {
    public static void main(String[] args) {
        
    

    Scanner rafif = new Scanner(System.in);

    System.out.println("--- CETAK KRS SIAKAD ---");
    System.out.println("Apakah UKT sudah lunas ? (true/false): ");
    boolean uktLunas = rafif.nextBoolean();

    String pesan ;
    pesan = uktLunas ? "Pembayaran UKT Terverifikasi \nSilahkan Cetak KRS dan Minta Tanda Tangan DPA" : "Registrasi Ditolak. Silahkan Lunasi UKT Terlebih Dahulu";
    System.out.println(pesan);
}
}
