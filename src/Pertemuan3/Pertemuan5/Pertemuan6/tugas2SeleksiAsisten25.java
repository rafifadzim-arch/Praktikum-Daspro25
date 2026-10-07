package Pertemuan3.Pertemuan5.Pertemuan6;

import java.util.Scanner;

public class tugas2SeleksiAsisten25 {
    public static void main(String[] args) {
        
    Scanner rafif = new Scanner(System.in);

    boolean mahasiswaAktif;
    boolean tidakDiSanksi;
    int nilaiDaspro;
    boolean punyaSertifikat;
    int nilaiWawancara;
    int miDaspro = 75+ (3%11);
    int minWawancara = 70+ (3%11);

    System.out.print("apakah mahasiswa berstatus aktif ? (true/false) :");
    mahasiswaAktif = rafif.nextBoolean();
    System.out.print("apakah mahasiswa tidak sedang mendapatkan sanksi ? (true/false) :");
    tidakDiSanksi = rafif.nextBoolean();
    System.out.print("apakah mempunyai sertifikat ? (true/false) :");
    punyaSertifikat = rafif.nextBoolean();
    System.out.print("nilai daspro :");
    nilaiDaspro = rafif.nextInt();
    System.out.print("nilai wawancara :");
    nilaiWawancara = rafif.nextInt();
    
    if (nilaiDaspro >85 || punyaSertifikat){
        System.out.println("syarat terpenuhi");
    }else{
        System.out.println("syarat tidak terpenuhi. karena nilai daspro di bawah 85 atau tidak memiliki sertifikat");
    }
    if (mahasiswaAktif && tidakDiSanksi && nilaiDaspro >85 || punyaSertifikat){
        System.out.println("mahasiswa akan di panggil untuk mengikuti wawancara");
    
    }else{
        System.out.println("mahasiswa tidak di panggil untuk wawancara. karena tidak memenuhi syarat");
    }
    if (nilaiWawancara >70 + (3%11)){
        System.out.println("mahasiswa di terima sebagai asisten");
    }else{
        System.out.println("mahasiswa tidak di terima menjadi asisten. karena nilai di bawah 85");
    }
  }
}
    
