/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 27 Februari 2026
*/

package pertemuan8;

public class LatihanTotalGenap {

    public static void main(String[] args) {

        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        int total = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue; // buat skip bilangan ganjil
            }
            total += i;
            System.out.println("Tambah: " + i + " → Total: " + total);
        }
        System.out.println("---");
        System.out.println("Total akhir: " + total);
    }
}