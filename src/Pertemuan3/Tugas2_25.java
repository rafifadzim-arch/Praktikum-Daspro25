package Pertemuan3;

import java.util.Scanner;

public class Tugas2_25 {
    public static void main(String[] args) {

    Scanner rafif = new Scanner(System.in);
        int x;
        double cetak;
        double jilid=5000;
        double total;

        System.out.println("masukan jumlah dokumen yang ingin di cetak : ");
        x=rafif.nextInt();

        cetak=x*500;
        total=cetak+jilid;

        System.out.println("total biaya yang harus di bayar : " + total);

        rafif.close();
    }
    
}
