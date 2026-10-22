package Pertemuan7;
import java.util.Scanner;

public class cobaLoginUjian_25 {
    public static void main(String[] args) {
        Scanner rafif = new Scanner(System.in);
        String ukt, kompen;
        String password;

        System.out.print("Massukkan password: ");
        password = rafif.nextLine();

        if (password.equals("daspro2026")) {
            System.out.print("Apakah UKT lunas(ya/tidak): ");
            ukt = rafif.nextLine();
            System.out.print("Apakah bebas kompen(ya/tidak): ");
            kompen = rafif.nextLine();
            if (ukt.equalsIgnoreCase("ya") && kompen.equalsIgnoreCase("ya")) {
                System.out.println("Login berhasil! Anda diizinkan masuk ke ruang ujian online.");
            } else if (ukt.equalsIgnoreCase("tidak") && kompen.equalsIgnoreCase("ya")) {
                System.out.println("Akses ditolak: Harap selesaikan pembayaran UKT terlebih dahulu.");
            } else if (ukt.equalsIgnoreCase("ya") && kompen.equalsIgnoreCase("tidak")) {
                System.out.println("Akses ditolak: Anda belum bebas dari tanggungan kompen.");
            }
        } else {
            System.out.println("Login gagal: Password yang anda masukkan salah.");
        }
    }
}
        
    
