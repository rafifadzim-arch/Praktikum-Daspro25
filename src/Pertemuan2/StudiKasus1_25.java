package Pertemuan2;
import java.util.Scanner;

public class StudiKasus1_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajipokok;
        int tunjangan;
        int jumlahanak;
        double potongan = 0.10;

        System.out.println("masukan gaji pokok");
        gajipokok = sc.nextInt();
        System.out.println("masukan tunjangan");
        tunjangan = sc.nextInt();
        System.out.println("masukanjumlahanak");
        jumlahanak = sc.nextInt();

        int totaltunjangan = tunjangan*jumlahanak;
        double potonganpensiunan = gajipokok*potongan;
        double gajibersih = gajipokok+totaltunjangan-potonganpensiunan;


     System.out.println(gajibersih);
     sc.close();


    
        
    }
    
    
}
