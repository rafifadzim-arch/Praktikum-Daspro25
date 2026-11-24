package Pertemuan12;
import java.util.Scanner;

public class Tugas2Kafe25 {
    static int cariMenu(String[] menu, String nama) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(nama)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===== KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.println("\n--- Pencarian Menu ---");
        System.out.print("Masukkan nama menu yang dicari: ");
        String cari = input.nextLine();
        int idx = cariMenu(menu, cari);
        if (idx != -1) {
            System.out.println(menu[idx] + " tersedia, harga Rp" + harga[idx]);
        } else {
            System.out.println("Menu \"" + cari + "\" tidak tersedia.");
        }

        System.out.println("\n--- Pemesanan ---");
        System.out.print("Masukkan jumlah item yang dipesan: ");
        int jumlah = Integer.parseInt(input.nextLine().trim());
        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            int pos;
            do {
                System.out.print("Pesanan ke-" + (i + 1) + ": ");
                String nama = input.nextLine();
                pos = cariMenu(menu, nama);
                if (pos == -1) {
                    System.out.println("Menu tidak tersedia, silakan ulangi.");
                }
            } while (pos == -1);
            pesanan[i] = menu[pos];
            hargaPesanan[i] = harga[pos];
            total += harga[pos];
        }

        System.out.println("\n========== STRUK PESANAN ==========");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d. %-16s Rp%,10d%n", (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("-----------------------------------");
        System.out.printf("%-19s Rp%,10d%n", "TOTAL BIAYA", total);
        System.out.println("===================================");
    }
}
