package pertemuan_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // topic : array
        // - Array satu dimensi int[]
        // - Array multidimensi int[][]

        Scanner scanner = new Scanner(System.in);

        int[] data = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int i, x = 0;

        System.out.println("Masukkan Angka Yang ingin di cari:");
        x=scanner.nextInt();

        System.out.println("Update Nilai Variabel x = "+ x);
        System.out.println("Mencari Data X = "+ x);
         for (int j = 0; j < data.length; j++) {
           if (data[j]==x) {
            System.out.println("Data "+x+" Ditemukan di index "+j);
            break;
           }
        }

    }

}
