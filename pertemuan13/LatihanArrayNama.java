/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 25 Maret 2026
*/

package pertemuan13;

public class LatihanArrayNama {
    public static void main(String[] args) {

        // untuk menyimpan nama
        String[] nama = {"Andi", "Budi", "Citra", "Deni", "Eka"};
        System.out.println("=== DAFTAR NAMA ===");

        // untuk menampilkan nama dan nomor urut
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i]);
        }
    }
}