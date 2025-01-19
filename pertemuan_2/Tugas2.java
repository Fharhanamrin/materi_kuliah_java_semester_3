package pertemuan_2;

public class Tugas2 {
    public static void main(String[] args) {
         // Multi-dimensional array
        //  Tipe_data nama_array [][] = tipe_data[baris][kolom];
         int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Multi-dimensional Array:");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
