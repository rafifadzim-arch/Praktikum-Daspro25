package Pertemuan3.Pertemuan5;

import java.util.Scanner;

public class PemilihanSwitch25 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);
        

        System.out.println("--- Cetak KRS siakad ---");
        System.out.println("Masukan semester saat ini");
         int semester = rafif.nextInt();

        switch (semester) {
        case 1 :
        System.out.println("KRS semester 1 di tampilkan");
        break;
        case 2:
        System.out.println("KRS semester 2 di tampilkan");
        break;
        case 3:
        System.out.println("KRS semester 3 di tampilkan");
        break;
        case 4:
        System.out.println("KRS semester 4 di tampilkan");
        break;
        case 5:
        System.out.println("KRS semester 5 di tampilkan");
        break;
        case 6:
        System.out.println("KRS semester 6 di tampilkan");
        break;
        case 7:
        System.out.println("KRS semester 7 di tampilkan");
        break;
        case 8:
        System.out.println("KRS semester 8 di tampilkan");
        break;
        default:
            System.out.println("Semester tidak valid");
        
    } 
  }

}