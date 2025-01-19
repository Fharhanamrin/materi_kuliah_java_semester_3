package pertemuan_5;

public class Tugas_5 {
    // looping string
    public static void main(String[] args) {
        System.out.println("Tugas Pertemuan 5");
        String text = "Pemrograman Java";

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.substring(i,i+1));
        }

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.substring(i,text.length()));
        }
        int j = text.length();
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.substring(j-(i+1)));
        }
    }
}
