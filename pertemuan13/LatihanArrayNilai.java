/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 25 Maret 2026
*/

package pertemuan13;

public class LatihanArrayNilai {
    public static void main(String[] args) {
        int[] nilai = {85, 90, 78, 92, 88};
        System.out.println("=== DAFTAR NILAI ===");

        // untuk menampilkan nilai 
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai " + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("Total Nilai: " + nilai.length);
    }
}