package Pertemuan3.Pertemuan5.Pertemuan6;

import java.util.Scanner;

public class nestedUjianSkripsi25 {
    
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        String pesan ;

        System.out.print("Apakah mahasiswa bebas kompen? (ya/tidak): ");
        String bebasKompen = rafif.nextLine().trim();

        System.out.print("masukan jumlah log bimbingan pembimbing 1:");
        int bimbinganP1 = rafif.nextInt();
        System.out.print("masukan jumlah log bimbingan pembimbing 2:");
        int bimbinganP2 = rafif.nextInt();

        if (bebasKompen.equalsIgnoreCase( "ya")){
            if (bimbinganP1 >= 6 && bimbinganP2 >= 4 ) {
                pesan = "semua syarat terpenuhi. mahasiswa boleh mengikuti ujian skripsi";
            } else if (bimbinganP1 < 6 && bimbinganP2 < 4 ) {
                pesan = "gagal! log bimbingan P1 kurang dari 6 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 6 ) {
                pesan = "gagal! log bimbingan P1 belum mencapai 6 kali";
            } else  {
                pesan = "gagal! log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "gagal! mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);



        
    }
}
