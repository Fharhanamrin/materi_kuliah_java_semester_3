package pertemuan_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pertemuan_10{
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] data = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int x = 0;

        System.out.println("Masukkan Angka Yang ingin di cari:");
        try {
            x = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid, harap masukkan angka.");
            return;
        }

        System.out.println("Update Nilai Variabel x = " + x);
        System.out.println("Mencari Data X = " + x);
        boolean found = false;

        for (int j = 0; j < data.length; j++) {
            if (data[j] == x) {
                System.out.println("Data " + x + " Ditemukan di index " + j);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Data " + x + " tidak ditemukan.");
        }

    }

}
