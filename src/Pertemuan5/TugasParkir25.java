package Pertemuan3.Pertemuan5;

import java.util.Scanner;

public class TugasParkir25 {
    public static void main(String[] args) {
        Scanner rafif = new Scanner(System.in);
        int lamaParkir,tarif;


        System.out.print("berapa lama parkir =");
        lamaParkir = rafif.nextInt();

        if(lamaParkir <= 2 ) {
            tarif = 2000;
        }else{
            tarif = 2000 + ((lamaParkir-2)*1000);
        
        }
        System.out.println("lama parkir = " + lamaParkir + "jam");
        System.out.println("total tarif = " + "Rp" + tarif);
        
    }
    
}
