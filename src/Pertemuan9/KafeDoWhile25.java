
//harga kopi = 11000
//harga teh = 6000
//harga roti = 16000
import java.util.Scanner;

public class KafeDoWhile25 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;

        do {
            System.out.print("masukan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = rafif.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = rafif.nextInt();
            System.out.print("Jumlah teh: ");
            teh = rafif.nextInt();
            System.out.print("Jumlah roti: ");
            roti = rafif.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus di bayar: Rp " + totalHarga);
            rafif.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
        rafif.close();
    }
}
