package Pertemuan10;

import java.util.Scanner;

public class Tugas225 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int n = rafif.nextInt();

        if (n < 3) {
            System.out.println("N Minimal 3.");
        } else {
            int jumlah = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    System.out.printf("%4d", hasil);
                    jumlah += hasil;
                }
                System.out.println();
            }
            System.out.println("Jumlah Seluruh Angka: " + jumlah);
        }
        rafif.close();

    }

}
