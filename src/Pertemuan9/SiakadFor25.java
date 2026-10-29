
//batas perulangan for = 10
//batas kelulusan = 58
import java.util.Scanner;
public class SiakadFor25 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("masukan nilai mahaiswa ke-" + i + ": ");
            nilai = rafif.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            } 
            if (nilai >= 58) {
                lulus += 1;
            } else {
                tidakLulus += 1;
            }
        }
        System.out.println("nilai tertinggi : " + tertinggi);
        System.out.println("nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);
        rafif.close();
    }
}

