package Pertemuan12;

public class ArrayBilangan25 {
    public static void main(String[] args) {

        int[] bil = {25,33,3,30};
        bil[0] = 25;
        bil[1] = 33;
        bil[2] = 3;
        bil[3] = 30;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + " double = " + (bil[i] * 2));
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        
        
    }
}