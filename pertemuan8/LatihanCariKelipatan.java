/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 27 Februari 2026
*/

package pertemuan8;

public class LatihanCariKelipatan {

    public static void main(String[] args) {
      
        System.out.println("=== CARI KELIPATAN 7 ===");
        for (int i = 1; i <= 50; i++) {
            System.out.println("Cek: " + i);

            if (i % 7 == 0) {
                System.out.println("✓ Kelipatan 7 pertama: " + i);
                break; 
            }
        }
        System.out.println("Pencarian selesai.");
    }
}