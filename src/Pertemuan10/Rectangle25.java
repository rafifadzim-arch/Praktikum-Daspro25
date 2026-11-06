package Pertemuan10;

import java.util.Scanner;

public class Rectangle25 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        System.out.print("Masukan Jumlah Baris: ");
        int baris = rafif.nextInt();
        System.out.print("Masukan Jumlah Kolom: ");
        int kolom = rafif.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        rafif.close();
    }

}
