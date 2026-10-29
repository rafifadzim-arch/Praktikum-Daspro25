
//absen = 25
//tarif parkir mobil = 2750
//tarif parkir motor = 1750
import java.util.Scanner;
public class tempatParkir25 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        int tarifMobil = 2750;
        int tarifMotor = 1750;

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = rafif.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = rafif.nextInt();

                if (jenis == 1) {
                    total += durasi * tarifMobil;
                } else {
                    total += durasi * tarifMotor;
                }
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
        rafif.close();
         

    }
    
}
