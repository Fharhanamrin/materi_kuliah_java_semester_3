package pertemuan_4;

public class Pertemuan_4 {
    // TOPIk : Exception Handling
    // untuk mendapatkan error yang unix kadang tidak 
    // terlihat jika tidak menggunakan Exception Handling
    public static void main(String[] args) {
        System.out.println("Pertemuan 4");
        // Running Code
        // System.out.println("Sebelum Pembagian");
        // System.out.println(5/0);
        // System.out.println("Setelah Pembagian");
        // error :
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        try {
        System.out.println("Sebelum Pembagian");
        System.out.println(5/0);
        System.out.println("Setelah Pembagian");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("code terakir yang akan di jalankan");
        }
    }
}
