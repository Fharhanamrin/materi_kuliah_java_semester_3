package pertemuan_5;

public class Pertemuan_5 {
    // TOPIK : Operasi String
    // Penggunaan length, equals, equalsIgnoreCase, toLowerCase, toUpperCase
    // concat, Integer.parseInt(),substring() 
    public static void main(String[] args) {
        
        // get length string
        // index dari  : 0 address[0]=B, panjang string di hitung dari : 1
        String address = "Belajar Pemrograman 3";
        System.out.println(address);
        System.out.println("Addres Length = "+ address.length());

        // equals, equalsIgnoreCase
        String name = "Fharhan Amrin Sitanggang";
        System.out.println(name.equals("Fharhan Amrin Sitanggang"));//true
        System.out.println(name.equals("fharhan amrin sitanggang"));//validation huruf besar dan kecil
        System.out.println(name.equalsIgnoreCase("fharhan amrin sitanggang"));//losss tanpa validasi

        // toLowerCase = kata terakir di ubah menjadi huruf kecil semua
        // toUppercase = kata terakir di ubah menjadi huruf besar semua
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // concat gabung string contoh name + umur
        String umur = "Umur 10 Tahun";

        System.out.println(name.concat(umur));

        // change string to number
        String angka = "100";
        int angkaNumber = Integer.parseInt(angka);
        int total = angkaNumber+100;
        System.out.println("Total "+total);

        // substring
        String kalimat = "Belajar Pemrograman 3";
        System.out.println(kalimat.substring (3));//longkap 3 kata
        System.out.println(kalimat.substring (0,4));//mengambil nilai index dari 0 dan spasi bela j= index ke <4 gak masuk
        System.out.println(kalimat.substring (8,17));
    }
}
