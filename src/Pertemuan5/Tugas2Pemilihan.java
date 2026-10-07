package Pertemuan3.Pertemuan5;

import java.util.Scanner;

public class Tugas2Pemilihan {
    public static void main(String[] args) {
        

    Scanner rafif = new Scanner (System.in);
    int jumlahSks;

    System.out.print("masukan jumlah sks yang ingin diambil");
    jumlahSks = rafif.nextInt();

    if (jumlahSks > 24) {
        System.out.println("melebihi batas");
    }else{
        System.out.println("KRS Valid");
    }
    }
    
}

