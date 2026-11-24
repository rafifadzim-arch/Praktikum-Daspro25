package Pertemuan12;

import java.util.Arrays;

public class SortNilai25 {
    static void bubbleAsc(int[] nilai) {
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
    }

    static void bubbleDesc(int[] nilai) {
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] < nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nilai = { 78, 65, 90, 55, 88, 72 };
        bubbleAsc(nilai);
        System.out.println(Arrays.toString(nilai));
    }

}
