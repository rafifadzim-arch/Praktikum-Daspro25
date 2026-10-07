package Pertemuan3;

import java.util.Scanner;

public class Tugas1_25 {
    public static void main(String[] args) {

        try(Scanner rafif = new Scanner(System.in);){

        double hargaLaptop, uangMuka , cicilanPerBulan ;
        double bunga = 0.02;
        double sisaHarga;
        double totCicilan;
        double biayaCicilan;
        double cicilBulanan;

        System.out.print("masukan harga laptop = ");
        hargaLaptop = rafif.nextDouble();
        System.out.print("masukan uang muka = ");
        uangMuka = rafif.nextDouble();
        System.out.print("masukan berapa bulan cicilan = ");
        cicilanPerBulan = rafif.nextDouble();

        sisaHarga = hargaLaptop-uangMuka;
        biayaCicilan = sisaHarga*0.02;
        totCicilan = sisaHarga /cicilanPerBulan + biayaCicilan;

        System.out.println("Total Cicilan = " + totCicilan);



        
    }

    }
    
}
