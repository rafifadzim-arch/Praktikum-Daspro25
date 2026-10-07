package Pertemuan3.Pertemuan5;

import java.util.Scanner;

public class PemilihanIf25 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = rafif.nextBoolean();

        if (uktLunas) {
         System.out.println("Pembaysran ukt terverifikasi");
         System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }else {
         System.out.println("Registrasi di tolak , Silahkan lunasi UKT terlebih dahulu");
        }




        
    }
    
}
