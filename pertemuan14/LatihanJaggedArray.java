/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 25 Maret 2026
*/

package pertemuan14;

public class LatihanJaggedArray {
    public static void main(String[] args) {

        int[][] data = {
            {10, 20},           // baris 0 (2 elemen)
            {30, 40, 50, 60},   // baris 1 (4 elemen)
            {70, 80, 90}        // baris 2 (3 elemen)
        };
        
        System.out.println("=== JAGGED ARRAY ===");

        // untuk menampilkan isi array
        for (int i = 0; i < data.length; i++) {
            System.out.print("Baris " + i + " (" + data[i].length + " elemen): ");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }

            System.out.println();
        }
    }
}