package Pertemuan3;

import java.util.Scanner;

public class CobaCoba25 {
    public static void main(String[] args) {

    Scanner rafif = new Scanner(System.in);

    int x;
    double cetak;
    double sampul=2000;
    double total;

    System.out.println("masukan jumlah dokumen yang di cetak");
    x=rafif.nextInt();

    cetak=x*300;
    total=cetak+sampul;

    System.out.println("total biaya yang harus di bayar = " + total);

    rafif.close();









        
    }
    
}
