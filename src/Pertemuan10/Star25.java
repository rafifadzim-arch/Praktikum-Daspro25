package Pertemuan10;
import java.util.Scanner;

public class Star25 {
    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        System.out.print("Masukan Nilai N = ");
        int n = rafif.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        rafif.close();
        
    }
    
}
