package Pertemuan3.Pertemuan5;

import java.util.Scanner;

public class PemilihanIfElse25 {
    public static void main(String[] args) {
        
    

    Scanner rafif = new Scanner(System.in);
    int semester;

    System.out.println("--- Cetak KRS Siakad ---");
    System.out.println("masukan semester saat ini = ");
    semester = rafif.nextInt();

    if (semester == 1) {
        System.out.println("KRS semester 1 di tampilkan");}
        else if (semester == 2) {
            System.out.println("KRS semester 2 di tampilkan");}
        else if (semester == 3) {
            System.out.println("KRS semester 3 di tampilkan");}
        else if (semester == 4) {
            System.out.println("KRS semester 4 di tampilkan");}
        else if (semester == 5) {
            System.out.println("KRS semester 5 di tampilkan");}
        else if (semester == 6) {
            System.out.println("KRS semester 6 di tampilkan");}
        else if (semester == 7) {
            System.out.println("KRS semester 7 di tampilkan");}
        else if (semester == 8 ){
            System.out.println("KRS semester 8 di tampilkan");}
        else{
            System.out.println("semester tidak valid");}





    }
}
