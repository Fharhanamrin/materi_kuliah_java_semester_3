package pertemuan_3;

import java.util.Scanner;

public class Pertemuan_3 {
    public static void main(String[] args) {
        // int[][] = [row][column]
        // buatkan program input jumlah mahasiswa x lalu masukkan nilai NPM, nama
        // lalu tampilan semua data yang kita input tadi
        int input = 0;
        System.out.println("Pertemuan 3");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jumlah Data Yang Ingin Di Input");
        input = scanner.nextInt();
        String data[][] = new String[input][3];

        for (int i = 0; i < input; i++) {
            scanner.nextLine(); 
            System.out.print("NPM :");
            data[i][0]=scanner.nextLine();
          
            System.out.print("NAMA :");
            data[i][1]=scanner.nextLine();
            
            System.out.print("Alamat :");
            data[i][2]=scanner.nextLine();

            
            
        }
        System.out.println("=============================");
        System.out.println("NPM     | Nama      | Alamat");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i][0]);
            System.out.print(data[i][1]);
            System.out.print(data[i][2]);
            System.out.println();
        }

    }
}
