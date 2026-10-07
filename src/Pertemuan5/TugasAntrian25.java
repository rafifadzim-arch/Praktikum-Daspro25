package Pertemuan3.Pertemuan5;

import java.util.Scanner;

public class TugasAntrian25 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);
    
        int kode ;
        System.out.print("masukan kode layanan");
        kode = rafif.nextInt();
        switch (kode) {
            case 1 :
                System.out.print("legalisir ijazah -loket A");
                break;
            case 2 :
                System.out.print("surat keterangan aktif kuliah -loket B");
                break;
            case 3 :
                System.out.print("pembayaran UKT -loket C");
                break;
            case 4:
            System.out.print("pengajuan cuti akademik -loket D3");
                break;
            default :
              System.out.println("kode layanan tidak dikenal");
              break;

        }

            
        
        

        
    }
    
}
