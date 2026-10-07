package Pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang25 {
    public static void main(String[] args) {

        try (Scanner rafif = new Scanner(System.in);) {

        int panjang;
        int lebar;
        int luas;

        panjang=rafif.nextInt();
        lebar=rafif.nextInt();

        luas=panjang*lebar;

        System.out.println("luas persegi adalah " +luas);
        
        }
    }
}
