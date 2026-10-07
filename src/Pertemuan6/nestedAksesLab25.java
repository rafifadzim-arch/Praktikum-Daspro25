package Pertemuan3.Pertemuan5.Pertemuan6;

import java.util.Scanner;

public class nestedAksesLab25 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        rafif.nextBoolean();

        System.out.println("mahasiswa aktif ? (true/false) :");
        mahasiswaAktif = rafif.nextBoolean();
        System.out.println("sedang di sanksi ? (true/false) :");
        sedangDisanksi = rafif.nextBoolean();
        System.out.println("punya izin dosen ? (true/false) :");
        punyaIzinDosen = rafif.nextBoolean();
        System.out.println("asistenLab ? (true/false) :");
        asistenLab = rafif.nextBoolean();


        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("akses laboratorium di berikan");
            } else {
                System.out.println("akses di tolak: membutuhkan izin dosen atau status asisten lab");
            }

            } else {
                System.out.println("akses di tolak: mahasiswa tidak memenuhi syarat");}

       } 
        
    }

    
    
