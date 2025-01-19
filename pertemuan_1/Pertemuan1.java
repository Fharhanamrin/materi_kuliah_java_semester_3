public class Pertemuan1 {
    public static void main(String[] args) {
        // Ringkasan
        // Penulisan Variabel pada java di tulis seperti "TYPEDATA NameVariabel =
        // Value";
        // if, switch, for, array int int[] namevariabel = {1,2,3,4,5}

        // Integer types
        byte byteValue = 127; // 8-bit
        short shortValue = 32000; // 16-bit
        int intValue = 100000; // 32-bit
        long longValue = 10000000000L; // 64-bit

        // Floating-point types
        float floatValue = 3.14f; // 32-bit
        double doubleValue = 3.14159265359; // 64-bit

        char charValue = 'A';

        boolean booleanValue = true;

        // ARRAY INTEGER
        int[] intArray = { 1, 2, 3, 4, 5 };

        Object objectValue = new Object();

        // example print 1 intArray
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // example print 2 intarray

        for (int num : intArray) {
            System.out.println("num " + num);
        }

        System.out.println("byteValue " + byteValue);
        System.out.println("shortValue " + shortValue);
        System.out.println("intValue " + intValue);
        System.out.println("longValue " + longValue);
        System.out.println("floatValue " + floatValue);
        System.out.println("doubleValue " + doubleValue);
        System.out.println("charValue " + charValue);
        System.out.println("booleanValue " + booleanValue);

        int umur = 16;
        if (umur >= 18) {
            System.out.println("Umur Anda Sudah Masuk Fase Dewasa ");
        } else {
            System.out.println("Umur Anda Belom Masuk Fase Dewasa");
        }

        // switch
        // print bulan ke 3

        int bulan = 3;
        switch (bulan) {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Agustus");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Desember");
                break;

            default:
                break;
        }

        // print month, array
        String[] month = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};

        System.out.println(month[1]);
        for (String string : month) {
            System.out.println(string);
        }

    }
}
