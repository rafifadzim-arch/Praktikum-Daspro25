package Pertemuan3.Pertemuan5.Pertemuan6;

import java.util.Scanner;

public class tugasDiskonBuku25 {
    public static void main(String[] args) {
        
    

    Scanner rafif = new Scanner(System.in);

    int P = 25;
    
    

    System.out.print("jenis (1=kamus, 2=novel, 3=lainnya) :");
    int jenis = rafif.nextInt();
    System.out.print("jumlah buku : ");
    int jumlah = rafif.nextInt();
    System.out.print("harga satuan : ");
    double harga = rafif.nextDouble();

    int diskon;
    if (jenis == 1) {
        if (jumlah > 2 + (1%2)) diskon  = 8 + (0%5) + 2;
        else diskon = 0 ;
    }else if (jenis == 2){
        if (jumlah > 3 +  (1%2)) diskon = 5 + (1%4) + 2;
        else diskon = 5 + (1%4) + 1;
    }else {
        if (jumlah > 3 + (1%2)) diskon = 3 + (1%4) ;
        else diskon = 0;
    }
    double bayar = jumlah * harga * (100 - diskon) / 100.0;

    System.out.println("diskon: " + diskon + "%");
    System.out.println("total bayar: Rp" + bayar );

}
}
