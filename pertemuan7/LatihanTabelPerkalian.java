/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 27 Februari 2026
*/

package pertemuan7;

public class LatihanTabelPerkalian {
    public static void main(String[] args) {

        int angka = 7;
        System.out.println("=== TABEL PERKALIAN " + angka + " ===");
        for (int i = 1; i <= 12; i++) {
            int hasil = angka * i;
            System.out.println(angka + " x " + i + " = " + hasil);
        }
    }
}