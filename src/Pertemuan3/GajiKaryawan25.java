package Pertemuan3;

import java.util.Scanner;

public class GajiKaryawan25 {
    public static void main(String[] args) {

        try (Scanner rafif = new Scanner (System.in);){
            
        double gajiPokok;
        double bonus, totGaji;
        double tunjTransparan=600000;
        double tunjMkn=400000;

        System.out.print("masukkan gaji pokok =");

        gajiPokok=rafif.nextFloat();

        bonus= 0.05*gajiPokok;
        totGaji=gajiPokok+tunjTransparan+tunjMkn+bonus-(0.1*gajiPokok);

        System.out.println("Bonus Bulanan anda adalah Rp. "+bonus);
        System.out.println("Gaji yang diterima adalah Rp. "+totGaji);

        }

    }
    
}
