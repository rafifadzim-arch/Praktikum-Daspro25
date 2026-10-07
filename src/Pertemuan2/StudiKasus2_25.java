package Pertemuan2;
import java.util.Scanner;

public class StudiKasus2_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lebartanah = 30;
        int panjangtanah = 100;
        int diameterkolam = 5;
        int panjangsisitaman = 2;

        int luasTanah = lebartanah * panjangtanah;
        int luasTaman = panjangsisitaman * panjangsisitaman;
        double jarijarikolam = diameterkolam / 2;
        double luaskolam = 3.14 * jarijarikolam * jarijarikolam;
        double luastidakgunakan = luasTanah - luaskolam - luasTaman;
        
        System.out.println(luastidakgunakan);

        sc.close();
    }
    
}
