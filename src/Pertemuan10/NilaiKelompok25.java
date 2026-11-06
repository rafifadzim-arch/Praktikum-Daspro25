package Pertemuan10;
//Pertanyaan No3
import java.util.Scanner;

public class NilaiKelompok25 {
    public static void main(String[] args) {
        Scanner rafif = new Scanner(System.in);

        System.out.print("Masukan Jumlah Kelompok : ");
        int jumlahKelompok = rafif.nextInt();
        System.out.print("Masukan Jumlah Penilai : ");
        int jumlahPenilai = rafif.nextInt();




        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah Kelompok Dan Penilai Harus > 0.");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                int totalNilai = 0;
                // nomorKelompok++;

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print(" Nilai Dari Penilai " + j + ": ");
                        nilai = rafif.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;



                    
                    
                }
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok" + nomorKelompok + " : nilai rata - rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }

                
                nomorKelompok++;
            }
            System.out.println("===============");
            System.out.println("Kelompok Terbaik    : " + kelompokTerbaik);
            System.out.println("Rata - rata tertinggi : " + rataTertinggi);

        }
        rafif.close();
    }
}
