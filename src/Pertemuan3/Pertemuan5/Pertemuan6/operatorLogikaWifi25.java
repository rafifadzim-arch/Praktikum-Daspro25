package Pertemuan3.Pertemuan5.Pertemuan6;

import java.util.Scanner;

public class operatorLogikaWifi25 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        boolean mahasiswa ; 
        boolean dosen ;
        boolean akunDiblokir ;

        System.out.print("apakah pengguna mahasiswa ? (true/false) :");
        mahasiswa = rafif.nextBoolean();

        System.out.print("apakah pengguna dosen ? (true/false) :");
        dosen = rafif.nextBoolean();

        System.out.print("apakah akun sedang di blokir ? (true/false) :");
        akunDiblokir = rafif.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("akses wifi di berikan");
        } else {
            System.out.println("akses wifi di tolak");
        }

        
    }
    
}
