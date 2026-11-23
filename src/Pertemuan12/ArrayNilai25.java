package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai25 {
    public static void main(String[] args) {
        
        int[]nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + ( i + 1 ) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        int jmlLulus = 0;
        int jmlTdkLulus = 0;

            for (int i = 0; i < nilaiAkhir.length; i++) {
                if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa Ke-" + ( i + 1 ) + ": " + nilaiAkhir[i] + " (LULUS) ");
                jmlLulus++;
                } else {
                    System.out.println("Mahasiswa Ke-" + ( i + 1 ) + ": " + nilaiAkhir[i] + " (TIDAK LULUS) ");
                    jmlTdkLulus++;
                }
            
            }
            System.out.println("Jmulah mahasiswa Lulus: " + jmlLulus);
            System.out.println("Jumlah mahasiswa Tidak Lulus: " + jmlTdkLulus);
        }
        }
    

