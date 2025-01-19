package pertemuan_7;

import java.io.*;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

public class Pertemuan_7 {
    // TOPIk : Stream
    public static void main(String[] args) {
        String x = "";
        int harga = 0, jumlah = 0, n = 0;
        try {
            String filePath = "/Users/users/Documents/semester3/materi_java_semester_3/pertemuan_7/harga.txt";

            FileInputStream fs = new FileInputStream(filePath);
            DataInputStream di = new DataInputStream(fs);
            // System.out.println("Working Directory = " + System.getProperty("user.dir"));
            while (di.available() != 0) {
                // String data = di.readLine();
                // System.out.println(data);
                x = di.readLine();
                // harga=Integer.parseInt(x.substring(1,5));
                // jumlah = harga;
                n = n + 1;
                System.out.println("Harga hari ke " + n + " : " + x);
            }

            String dataToAppend = "Data baru yang ingin ditambahkan";

            try (FileWriter fw = new FileWriter(filePath, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw)) {

                // Menambahkan data baru di akhir file
                
                pw.println(dataToAppend);
                System.out.println("Data berhasil ditambahkan ke file.");
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
            di.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        try {
            FileOutputStream out = new FileOutputStream(
                    "/Users/users/Documents/semester3/materi_java_semester_3/pertemuan_7/harga_out.txt");// akan kebuat
                                                                                                         // otomatis
                                                                                                         // jika file
                                                                                                         // tidak ada
            PrintStream p = new PrintStream(out);
            p.println("Fharhhan 1|Teknik Informatika|Semester 3");
            p.println("Fharhhan 2|Teknik Informatika|Semester 3");
            p.println("Fharhhan 3|Teknik Informatika|Semester 3");
            p.println("Fharhhan 4|Teknik Informatika|Semester 3");
            p.close();
            System.out.println("Tulis File Berhasil");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
