package Pertemuan10;

import java.util.Scanner;

public class Tugas125 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        int n;

        do {
            System.out.print("Masukan Nilai n: ");
            n = rafif.nextInt();
        } while (n < 1);

        int totalAngka = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalAngka++;
            }
            System.out.println();
        }
        System.out.println("Total Angka Tercetak: " + totalAngka);
        rafif.close();

    }

}
