package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai25 {
    public static void main(String[] args) {
        
        int[]nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
            for (int i = 0; i < nilaiAkhir.length; i++) {
                String status = (nilaiAkhir[i] > 70) ? "LuLus" : "Tidak LuLus";
                System.out.println("Mahasiswa Ke-" + ( i + 1 ) + ": " + nilaiAkhir[i] + " (" + status + ") ");
            }
        }
    }

