/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 26 Februari 2026
*/

package pertemuan5;

public class LatihanBilangan {

    public static void main(String[] args) {

        int number = 12; // // bisa ganti jadi "-7" buat testing output lainnya

        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);

        // buat cek positif/negatif/nol
        if (number > 0) {
            System.out.println("Jenis: Bilangan positif");
        } else if (number < 0) {
            System.out.println("Jenis: Bilangan negatif");
        } else {
            System.out.println("Jenis: Nol");
        }

        // buat cek genap/ganjil 
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }
        }
    }
}