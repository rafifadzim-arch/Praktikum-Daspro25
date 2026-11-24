package Pertemuan12;

import java.util.Arrays;

public class SortNilai25 {
    public static void main(String[] args) {
        int[] nilai = {45, 60, 37, 75, 25, 50};
        System.out.println("Sebelum sort: " + Arrays.toString(nilai));

        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("Sesudah sort: " + Arrays.toString(nilai));
    }
}
    