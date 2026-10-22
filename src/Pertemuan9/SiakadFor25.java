import java.util.Scanner;
public class SiakadFor25 {

    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        double nilai,tertinggi = 0 , terendah = 100;
        for (int i = 1; i <=10; i++) {
            System.out.print("masukan nilai mahaiswa ke-" + i + ": ");
            nilai = rafif.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("nilai tertinggi : " + tertinggi);
        System.out.println("nilai terendah : " + terendah);

         


        
    }
    
}
